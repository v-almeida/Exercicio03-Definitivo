package br.edu.up.modelos;

public class Preco {
    private double precoTotal;
    private double porcentagemAcrescimo;

    public Preco(double precoTotal, double porcentagemAcrescimo) {
        this.precoTotal = precoTotal;
        this.porcentagemAcrescimo = porcentagemAcrescimo;
    }

    public double calcularPrecoFinal() {
        return precoTotal * (1 + porcentagemAcrescimo / 100);
    }

    // Getters e setters
    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getPorcentagemAcrescimo() {
        return porcentagemAcrescimo;
    }

    public void setPorcentagemAcrescimo(double porcentagemAcrescimo) {
        this.porcentagemAcrescimo = porcentagemAcrescimo;
    }
}
