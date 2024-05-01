package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Humanos;

public class Exercicio11 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            Humanos pessoa = new Humanos(nome, sexo);
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());

            if (pessoa.getSexo() == 'M') {
                totalHomens++;
            } else if (pessoa.getSexo() == 'F') {
                totalMulheres++;
            }
        }

        System.out.println("\nTotal de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
