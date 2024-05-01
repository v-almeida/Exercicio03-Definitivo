package br.edu.up.modelos;

public class Trabalho17 {
    private String nome;
    private double salarioAtual;
    private double salarioMinimo;

    public Trabalho17(String nome, double salarioAtual, double salarioMinimo) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        double salarioMinimoTres = salarioMinimo * 3; // Três salários mínimos

        if (salarioAtual < salarioMinimoTres) {
            return salarioAtual * 1.5; // Reajuste de 50%
        } else if (salarioAtual >= salarioMinimoTres && salarioAtual <= salarioMinimoTres * 10) {
            return salarioAtual * 1.2; // Reajuste de 20%
        } else if (salarioAtual > salarioMinimoTres * 10 && salarioAtual <= salarioMinimoTres * 20) {
            return salarioAtual * 1.15; // Reajuste de 15%
        } else {
            return salarioAtual * 1.1; // Reajuste de 10%
        }
    }

    public double calcularAumentoFolha(double novoSalario) {
        return novoSalario - salarioAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }
}
