package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Trampo18;

public class Exercicio18 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Informe o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Informe o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        Trampo18 funcionario = new Trampo18(nome, idade, sexo, salarioFixo);
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("\nNome: " + nome);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
