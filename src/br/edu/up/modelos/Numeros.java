package br.edu.up.modelos;

public class Numeros {
    private int[] numeros;

    public Numeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int contarNumerosNoIntervalo() {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        return contador;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
