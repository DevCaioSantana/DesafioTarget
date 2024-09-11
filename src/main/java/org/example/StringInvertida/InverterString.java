package org.example.StringInvertida;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string para inverter: ");
        String stringInicial = scanner.nextLine();


        String stringInvertida = "";
        for (int i = stringInicial.length() - 1; i >= 0; i--) {
            stringInvertida += stringInicial.charAt(i);
        }

        System.out.println("String invertida: " + stringInvertida);
    }
}