package br.edu.up.modelos;

public class Automovel {
    private double distanciaPercorrida;
    private double combustivelConsumido;

    public Automovel(double distancia, double combustivel) {
        this.distanciaPercorrida = distancia;
        this.combustivelConsumido = combustivel;
    }

    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelConsumido;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelConsumido() {
        return combustivelConsumido;
    }

    public void setCombustivelConsumido(double combustivelConsumido) {
        this.combustivelConsumido = combustivelConsumido;
    }
}
