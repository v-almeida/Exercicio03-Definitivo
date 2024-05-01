package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Estudante;

public class Exercicio08 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);
        double media = estudante.calcularMedia();
        String mencao = estudante.obterMencao();

        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);

        scanner.close();
    }
}
