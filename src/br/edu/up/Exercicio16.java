package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Funcionario16;

public class Exercicio16 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int numFuncionarios = scanner.nextInt();

        Funcionario16[] funcionarios = new Funcionario16[numFuncionarios];

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            funcionarios[i] = new Funcionario16(nome, salario);
        }

        double totalReajuste = 0;

        // Calcula e exibe o reajuste para cada funcionário
        for (Funcionario16 funcionario : funcionarios) {
            double reajuste = funcionario.calcularReajuste();
            totalReajuste += reajuste;

            System.out.println("Nome: " + funcionario.getNome() + ", Salário: R$" + funcionario.getSalario() +
                    ", Reajuste: R$" + reajuste);
        }

        System.out.println("Total de reajuste: R$" + totalReajuste);

        scanner.close();
    }
}
