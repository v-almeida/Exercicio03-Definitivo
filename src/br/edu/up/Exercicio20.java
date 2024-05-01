package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Aprender20;

public class Exercicio20 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        System.out.println("Informe a quantidade de horas/aula ministradas:");
        int horasAula = scanner.nextInt();

        Aprender20 escola = new Aprender20(nivel);
        double salario = escola.calcularSalario(horasAula);

        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }
}
