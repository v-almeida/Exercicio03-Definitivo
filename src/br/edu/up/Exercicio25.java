package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Estudante25;

public class Exercicio25 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int numeroMatricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        Estudante25 estudante = new Estudante25(nome, numeroMatricula, notaLaboratorio, notaAvaliacaoSemestral,
                notaExameFinal);
        String classificacao = estudante.classificarEstudante();

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Número de Matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota Final: " + estudante.getNotaFinal());
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
