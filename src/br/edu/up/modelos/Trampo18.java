package br.edu.up.modelos;

public class Trampo18 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Trampo18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioLiquido() {
        double abono;
        if (sexo == 'M' && idade >= 30) {
            abono = 100.00;
        } else if (sexo == 'M' && idade < 30) {
            abono = 50.00;
        } else if (sexo == 'F' && idade >= 30) {
            abono = 200.00;
        } else {
            abono = 80.00;
        }

        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
