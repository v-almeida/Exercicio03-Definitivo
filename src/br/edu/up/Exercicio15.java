package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Concessionaria15;

public class Exercicio15 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        Concessionaria15 concessionaria = new Concessionaria15();
        concessionaria.executarVendas();

        scanner.close();
    }
}
