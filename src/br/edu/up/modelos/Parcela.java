package br.edu.up.modelos;

public class Parcela {
    private double valorCompra;

    public Parcela(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularPrecoParcela() {
        return valorCompra / 5;
    }

    // Getters e setters
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
