package org.example.code;

import java.util.Arrays;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o formato de estruturação da informação (XML, JSON ou YAML):");
        String formatoEscolhido = scanner.nextLine().toUpperCase();

        FormatoEstruturado formato;

        switch (formatoEscolhido) {
            case "XML":
                formato = new FormatoXML();
                break;
            case "JSON":
                formato = new FormatoJSON();
                break;
            case "YAML":
                formato = new FormatoYAML();
                break;
            default:
                System.out.println("Formato inválido. Use XML, JSON ou YAML.");
                return;
        }

        VeiculoEletrico veiculo = new VeiculoEletrico();
        UF uf = new UF("São Paulo", "SP", "São Paulo", Arrays.asList(-23.5505, -46.6333), 12345678, 248219.481, 49.77, Arrays.asList("São Paulo", "Rio de Janeiro", "Belo Horizonte"));

        try {
            // Formatar e exibir os objetos no formato escolhido
            String veiculoFormatado = formato.formatar(veiculo);
            String ufFormatada = formato.formatar(uf);

            System.out.println("Veículo elétrico:");
            System.out.println(veiculoFormatado);

            System.out.println("\nUnidade Federativa:");
            System.out.println(ufFormatada);
        } catch (Exception e) {
            System.out.println("Erro ao formatar a informação.");
        }
    }

}
