package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Numeros;

public class Exercicio09 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[80];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Numeros contador = new Numeros(numeros);
        int numerosNoIntervalo = contador.contarNumerosNoIntervalo();

        System.out.println("Número(s) no intervalo entre 10 e 150 (inclusive): " + numerosNoIntervalo);

        scanner.close();
    }
}
