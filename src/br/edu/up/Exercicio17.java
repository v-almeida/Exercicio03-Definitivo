package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Trabalho17;

public class Exercicio17 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        Trabalho17 funcionario = new Trabalho17(nome, salarioAtual, salarioMinimo);

        double novoSalario = funcionario.calcularReajuste();
        double aumentoFolha = funcionario.calcularAumentoFolha(novoSalario);

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Reajuste: " + (novoSalario - salarioAtual));
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);

        scanner.close();
    }
}
