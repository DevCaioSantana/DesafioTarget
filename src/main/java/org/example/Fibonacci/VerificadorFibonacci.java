package org.example.Fibonacci;

public class VerificadorFibonacci {

    public static boolean VerificarFibonacci(int numero) {
        if (numero < 0) { // se for menor q 0, não ira pertencer ao Fibonacci
            return false;
        }
        int a = 0, b = 1;

        // loop até que o número seja igual ou maior ao número informado
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            // próximo número da sequência é gerado
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;  // se loop se encerra eh pq não foi encontrado
    }
}