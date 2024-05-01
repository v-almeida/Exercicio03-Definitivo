package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Luz22;

public class Exercicio22 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (Residência(R), Comércio(C) ou Indústria(I)):");
        String tipoCliente = scanner.nextLine();

        System.out.println("Informe o consumo em kWh:");
        int consumo = scanner.nextInt();

        Luz22 luz = new Luz22(tipoCliente);
        double valorConta = luz.calcularConta(consumo);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        scanner.close();
    }
}
