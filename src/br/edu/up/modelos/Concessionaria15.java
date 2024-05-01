package br.edu.up.modelos;

import java.util.Scanner;

public class Concessionaria15 {
    public void executarVendas() {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Informe o valor do veículo (ou 0 para encerrar):");
            double valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Informe o tipo de combustível (álcool, gasolina ou diesel):");
            String tipoCombustivel = scanner.next();

            double desconto = calcularDesconto(valorVeiculo, tipoCombustivel);
            double valorPago = valorVeiculo - desconto;

            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorPago);

            totalDesconto += desconto;
            totalPago += valorPago;
        }

        System.out.println("\nTotal de desconto dado: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);

        scanner.close();
    }

    private double calcularDesconto(double valorVeiculo, String tipoCombustivel) {
        double desconto;

        switch (tipoCombustivel.toLowerCase()) {
            case "álcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                desconto = 0;
                System.out.println("Tipo de combustível inválido. Desconto será 0.");
                break;
        }

        return desconto;
    }
}
