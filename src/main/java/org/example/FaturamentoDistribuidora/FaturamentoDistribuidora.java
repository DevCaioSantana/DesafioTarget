package org.example.FaturamentoDistribuidora;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        try {
            String lerJson = new String(Files.readAllBytes(Paths.get("src/main/resources/faturamento.json")));
            JSONArray jsonFaturamentos = new JSONArray(lerJson);

            double[] faturamentos = new double[jsonFaturamentos.length()];
            int diasComFaturamento = 0;


            for (int i = 0; i < jsonFaturamentos.length(); i++) {
                JSONObject jsonObject = jsonFaturamentos.getJSONObject(i);
                double faturamento = jsonObject.getDouble("faturamento");

                // Ignorando dias sem faturamento
                if (faturamento > 0) {
                    faturamentos[diasComFaturamento] = faturamento;
                    diasComFaturamento++;
                }
            }


            double[] faturamentosValidos = new double[diasComFaturamento];
             //  copiando os valores de um array para outro
            for (int i = 0; i < diasComFaturamento; i++) {
                faturamentosValidos[i] = faturamentos[i];
            }


            double menorFaturamento = faturamentosValidos[0];
            double maiorFaturamento = faturamentosValidos[0];
            double somaFaturamento = 0;

            for (double faturamento : faturamentosValidos) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;

            // contar dias com faturamento diário foi superior à média mensal.
            int diasAcimaDaMedia = 0;
            for (double faturamento : faturamentosValidos) {
                if (faturamento > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.err.println("Erro" + e.getMessage());
        }
    }
}
