package br.net.venson.spring_semana05.controllers;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/olaMundo")
    public String olaMundo(@RequestParam String aluno) {
        return "Olá, " + aluno + "!";
    }

    @GetMapping("/gerarPdf")
    public ResponseEntity<InputStreamResource> gerarPdf(@RequestParam String funcionario) throws IOException {
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage();
        documento.addPage(pagina);

        PDPageContentStream stream = new PDPageContentStream(documento, pagina);
        stream.beginText();
        stream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 16);
        stream.newLineAtOffset(20, 500);
        stream.showText("Relatório de Vendas de " + funcionario);
        stream.endText();
        stream.close();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        documento.save(outputStream);
        byte[] binario = outputStream.toByteArray();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(binario);
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.status(201).contentType(MediaType.APPLICATION_PDF).body(resource);
    }
}
