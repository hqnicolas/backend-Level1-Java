package org.example;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Pergunta 1: Que ambientação você prefere?\n1. Sci-fi\n2. Medieval");
        int genrePref = scan.nextInt();
        if (genrePref != 1 && genrePref != 2) {
            System.out.println("Entrada inválida, encerrando programa...");
            return;
        }
        
        System.out.println("Pergunta 2: Que gênero você prefere?\n1. Comédia\n2. Drama");
        int typePref = scan.nextInt();
        if (typePref != 1 && typePref != 2) {
            System.out.println("Entrada inválida, encerrando programa...");
            return;
        }
        
        String recommendation = "";
        if(genrePref == 1){
          if(typePref == 1) recommendation = "Homens de Preto";
          else recommendation = "Arrival";
        } 
        else {
           if (typePref == 1) recommendation = "Shrek";
           else recommendation = "Gladiador";
        }
        
        System.out.println("Recomendação: " + recommendation);
    }
}
