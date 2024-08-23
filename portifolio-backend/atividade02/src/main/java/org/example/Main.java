package org.example;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Pergunta 1: Você prefere séries sci-fi ou medieval?");
        int genrePref = scan.nextInt();
        if (genrePref != 1 && genrePref != 2) {
            System.out.println("Entrada inválida, encerrando programa...");
            return;
        }
        
        System.out.println("Pergunta 2: Você prefere comédia ou drama?");
        int typePref = scan.nextInt();
        if (typePref != 1 && typePref != 2) {
            System.out.println("Entrada inválida, encerrando programa...");
            return;
        }
        
        String recommendation = "";
        if(genrePref == 1){
          if(typePref == 1) recommendation = "Friends";
          else recommendation = "Game of Thrones";
        } 
        else {
           if (typePref == 1) recommendation = "Casablanca";
           else recommendation = "The Prestige";
        }
        
        System.out.println("Recomendação: " + recommendation);
    }
}
