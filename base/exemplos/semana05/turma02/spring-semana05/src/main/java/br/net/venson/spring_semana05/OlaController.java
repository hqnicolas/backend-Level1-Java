package br.net.venson.spring_semana05;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
public class OlaController {
    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá mundo!";
    }

    @GetMapping("/temperatura")
    public Double converteTemperatura(@RequestParam Double fahrenheit) {
        Double celcius = (fahrenheit - 32) * (5.0/9.0);
        return celcius;
    }

    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> gerarPdf(String nome) throws IOException {
        PDDocument documento = new PDDocument(); // Instancia um documento PDF
        PDPage pagina = new PDPage(); // Instancia uma pagina em branco
        documento.addPage(pagina); // Adiciona a pagina no documento
        PDPageContentStream escritor = new PDPageContentStream(documento, pagina); // gera um escritor para a pagina
        PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.TIMES_BOLD);
        escritor.setFont(fonte, 18.5f);
        escritor.beginText();
        escritor.newLineAtOffset(25, 500);
        escritor.showText("Olá " + nome + "!");
        escritor.newLineAtOffset(0, -60);
        escritor.showText("Você esta dentro do pdf");
        escritor.endText();
        escritor.close();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        documento.save(outputStream);
        byte[] binario = outputStream.toByteArray();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(binario);
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.status(201).contentType(MediaType.APPLICATION_PDF).body(resource);
    }
}
