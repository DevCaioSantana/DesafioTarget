package org.example.FaturamentoPorEstado;

public class FaturamentoPorEstado {

    public static void main(String[] args) {

        double sp = 67836.43,
        rj = 36678.66,
        mg = 29229.88,
        es = 27165.48,
        outros = 19849.53;

        // Calcular faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Calcular o percentual de cada estado
        double percentSP = (sp / faturamentoTotal) * 100,
        percentRJ = (rj / faturamentoTotal) * 100,
        percentMG = (mg / faturamentoTotal) * 100,
        percentES = (es / faturamentoTotal) * 100,
        percentOutros = (outros / faturamentoTotal) * 100;


        String resultado = String.format(
                "Percentual de representação por estado:\n" +
                        "SP: %.2f%%\n" +
                        "RJ: %.2f%%\n" +
                        "MG: %.2f%%\n" +
                        "ES: %.2f%%\n" +
                        "Outros: %.2f%%\n",
                percentSP, percentRJ, percentMG, percentES, percentOutros
        );


        System.out.println(resultado);
    }
}
