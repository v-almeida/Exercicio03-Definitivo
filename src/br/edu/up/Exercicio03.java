package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.Vendedor;

public class Exercicio03 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Escreva o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Escreva o total de vendas: ");
        double totalVendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

        double salarioTotal = vendedor.calcularSalarioTotal();

        System.out.println("O salário total do vendedor " + vendedor.getNome() + " é: " + salarioTotal);

        scanner.close();
    }
}
