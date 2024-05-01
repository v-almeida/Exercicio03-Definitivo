package br.edu.up.modelos;

public class Seguradora26 {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Seguradora26(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoria() {
        if (idade >= 17 && idade <= 20) {
            return obterCategoria(1, 2, 3);
        } else if (idade >= 21 && idade <= 24) {
            return obterCategoria(2, 3, 4);
        } else if (idade >= 25 && idade <= 34) {
            return obterCategoria(3, 4, 5);
        } else if (idade >= 35 && idade <= 64) {
            return obterCategoria(4, 5, 6);
        } else if (idade >= 65 && idade <= 70) {
            return obterCategoria(7, 8, 9);
        } else {
            return "Não se enquadra em nenhuma categoria de seguro.";
        }
    }

    private String obterCategoria(int baixo, int medio, int alto) {
        switch (grupoRisco) {
            case 1:
                return "Categoria " + baixo + ": Baixo risco";
            case 2:
                return "Categoria " + medio + ": Médio risco";
            case 3:
                return "Categoria " + alto + ": Alto risco";
            default:
                return "Grupo de risco inválido";
        }
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

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(int grupoRisco) {
        this.grupoRisco = grupoRisco;
    }
}