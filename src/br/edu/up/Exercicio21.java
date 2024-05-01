package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Nadador21;

public class Exercicio21 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        Nadador21 nadador = new Nadador21(idade);
        String categoria = nadador.classificarNadador();

        System.out.println("O nadador está na categoria: " + categoria);

        scanner.close();
    }
}
