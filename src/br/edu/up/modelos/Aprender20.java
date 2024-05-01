package br.edu.up.modelos;

public class Aprender20 {
    private int nivel;
    private double valorHoraAula;

    public Aprender20(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido");
        }
    }

    public double calcularSalario(int horasAula) {
        return valorHoraAula * horasAula;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
