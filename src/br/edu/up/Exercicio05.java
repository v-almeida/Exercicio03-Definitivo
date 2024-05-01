package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Parcela;

public class Exercicio05 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        Parcela parcela = new Parcela(valorProduto);

        System.out.println("O preço da parcela é: " + parcela.calcularPrecoParcela());

        scanner.close();
    }
}
