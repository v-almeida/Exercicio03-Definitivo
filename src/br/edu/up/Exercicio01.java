/*1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve 
no semestre. No final informar o nome do aluno e a sua média (aritmética).
 */

package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Aluno;

public class Exercicio01 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        var aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Média aritmética: " + aluno.calcularMedia());

        scanner.close();

    }

}
