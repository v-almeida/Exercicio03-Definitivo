package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Mmc23;

public class Exercicio23 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        Mmc23 pessoa = new Mmc23(nome, sexo, altura, idade);
        double pesoIdeal = pessoa.calcularPesoIdeal();

        System.out.println("Nome: " + nome);
        System.out.println("Peso Ideal: " + pesoIdeal + " kg");

        scanner.close();
    }
}
