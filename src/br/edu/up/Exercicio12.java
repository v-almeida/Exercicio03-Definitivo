package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Carango;

public class Exercicio12 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar = 'S'; // Inicialize com 'S' para iniciar o loop

        while (continuar == 'S' || continuar == 's') {
            Carango carro = new Carango();
            carro.solicitarDados();

            if (carro.getAno() <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            System.out.println("Valor do desconto: R$" + carro.calcularDesconto());
            System.out.println("Valor a ser pago pelo cliente: R$" + carro.calcularValorAPagar());

            break;
        }

        System.out.println("\nTotal de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral: " + totalGeral);

        System.out.print("Deseja continuar calculando desconto? (S/N): ");
        if (scanner.hasNextLine()) {
            continuar = scanner.nextLine().toUpperCase().charAt(0);
        } else {
            // Se não houver mais entradas, encerre o programa
        }

        scanner.close();
    }
}
