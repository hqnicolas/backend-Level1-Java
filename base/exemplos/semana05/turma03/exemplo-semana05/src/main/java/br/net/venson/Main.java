package br.net.venson;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        // Cria o documento pdf na memoria
        PDDocument documento = new PDDocument();
        // Cria nova página
        PDPage paginaUm = new PDPage();
        // Adiciona a pagina no documento
        documento.addPage(paginaUm);
        Standard14Fonts.FontName nomeFonte = Standard14Fonts.FontName.TIMES_ROMAN;
        PDFont fonte = new PDType1Font(nomeFonte);
        // Criar um escritor de paginas
        PDPageContentStream escritor = new PDPageContentStream(documento, paginaUm);
        escritor.beginText();
        escritor.newLineAtOffset(25, 400);
        escritor.setFont(fonte, 20.5f);
        escritor.showText("Olá, " + nome);
        escritor.endText();
        escritor.close();
        // Salva o documento no sistema de arquivos
        documento.save("teste.pdf");
    }
}