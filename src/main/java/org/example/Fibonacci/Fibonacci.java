package org.example.Fibonacci;

import java.util.Scanner;

import static org.example.Fibonacci.VerificadorFibonacci.VerificarFibonacci;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Informe um número inteiro : ");
            int numero = scanner.nextInt();

            if (VerificarFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro");

        }
    }
}