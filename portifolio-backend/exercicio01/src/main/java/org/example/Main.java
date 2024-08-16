package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String inputName = scanner.nextLine();

        Integer randomNumber = generateRandomNumber();

        System.out.println("Your name is " + inputName + ", and the generated random name is " + randomNumber);
    }
    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
