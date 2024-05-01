/*2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a 
distância total percorrida pelo automóvel e o total de combustível gasto.
 */

package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.Automovel;

public class Exercicio02 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a distância percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("Escreva o total de combustível consumido: ");
        double combustivel = scanner.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivel);

        System.out.println("O consumo médio é " + automovel.calcularConsumoMedio() + " km/l");

        scanner.close();
    }
}
