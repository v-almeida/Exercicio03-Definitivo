package br.edu.up.modelos;

public class Humanos {
    private String nome;
    private char sexo;

    public Humanos(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }
}
