package br.edu.up;

import java.util.Scanner;

public class Exercicio04 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double precoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares: ");
        double quantidadeDolar = scanner.nextDouble();

        Dinheiro dinheiro = new Dinheiro(precoDolar, quantidadeDolar);

        System.out.println("O total em reais é: " + dinheiro.calcularTotalEmReais());

        scanner.close();
    }
}
