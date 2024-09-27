package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.addFilme("Homen Aranha", 15, 12);
        cinema.addFilme("A Origem", 20, 16);
        cinema.addFilme("Logan", 18, 14);

        while (true) {
            System.out.print("Qual filme você deseja assistir? ");
            String filme = scanner.nextLine();

            System.out.print("Qual assento você deseja? ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idadeCliente = scanner.nextInt();

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);

            try {
                boolean ingressoVendido = cinema.venderIngresso(cliente, assento);

                if (ingressoVendido) {
                    System.out.println("Ingresso vendido com sucesso! " + filme + " - " + assento + " - " + nomeCliente);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            scanner.nextLine();
        }
    }
}