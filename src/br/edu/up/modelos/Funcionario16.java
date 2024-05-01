package br.edu.up.modelos;

public class Funcionario16 {
    private String nome;
    private double salario;
    private static final double SALARIO_MINIMO = 1100; // Valor do salário mínimo

    public Funcionario16(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularReajuste() {
        double salarioMinimo = SALARIO_MINIMO * 3; // Três salários mínimos
        double salarioMaximo = SALARIO_MINIMO * 20; // Vinte salários mínimos

        if (salario < salarioMinimo) {
            return salario * 0.5; // Reajuste de 50%
        } else if (salario >= salarioMinimo && salario <= salarioMaximo) {
            return salario * 0.2; // Reajuste de 20%
        } else if (salario > salarioMaximo && salario <= salarioMaximo * 2) {
            return salario * 0.15; // Reajuste de 15%
        } else {
            return salario * 0.1; // Reajuste de 10%
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}