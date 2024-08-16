package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu Primeiro Nome: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Digite o seu Sobrenome: ");
        String lastName = scanner.nextLine();
        
        Integer randomNumber = generateRandomNumber();

        String username = createUsername(firstName, lastName, randomNumber);
        System.out.println("Your generated username is: " + username);
    }
    
    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    
    private static String createUsername(String firstName, String lastName, Integer randomNumber){
        String username = "";

        firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1).toLowerCase();
        lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();

        if (randomNumber < 10){
            username = firstName + lastName + "0" + randomNumber;
        } else {
            username = firstName + lastName + randomNumber;
        }

        return username;
    }
}