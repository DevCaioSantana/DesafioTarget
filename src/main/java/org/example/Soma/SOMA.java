package org.example.Soma;

public class SOMA {
    public static void main(String[] args) {
        int indice = 13, soma = 0, K = 0;

        // Loop ira até K ser menor que o valor do indice
        while (K < indice) {
            K += 1;
            soma += K;
        }

        System.out.println("O valor final da variável SOMA é: " + soma);
    }
}
