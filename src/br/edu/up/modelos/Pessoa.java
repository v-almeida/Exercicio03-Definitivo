package br.edu.up.modelos;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String obterClassificacaoIdade() {
        if (idade >= 18) {
            return "maior de idade";
        } else {
            return "menor de idade";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
