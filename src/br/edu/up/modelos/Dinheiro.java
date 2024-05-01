package br.edu.up.modelos;


public class Dinheiro {
    private double precoDolar;
    private double quantidadeDolar;

    public Dinheiro(double precoDolar, double quantidadeDolar) {
        this.precoDolar = precoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }

    public double calcularTotalEmReais() {
        return precoDolar * quantidadeDolar;
    }

    // Getters e setters
    public double getPrecoDolar() {
        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {
        this.precoDolar = precoDolar;
    }

    public double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public void setQuantidadeDolar(double quantidadeDolar) {
        this.quantidadeDolar = quantidadeDolar;
    }
}