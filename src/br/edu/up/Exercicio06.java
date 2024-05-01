package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Preco;

public class Exercicio06 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o valor do produto: ");
        double precoTotal = scanner.nextDouble();

        System.out.print("Escreva a porcentagem de acréscimo: ");
        double porcentagemAcrescimo = scanner.nextDouble();

        Preco preco = new Preco(precoTotal, porcentagemAcrescimo);
        double precoFinal = preco.calcularPrecoFinal();

        System.out.println("O valor com acréscimo é: " + precoFinal);

        scanner.close();
    }
}
