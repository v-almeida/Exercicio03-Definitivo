package br.edu.up.modelos;

import java.util.Scanner;

public class Militares {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public void lerDados(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Sexo (M/F): ");
        this.sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Saúde (true/false): ");
        this.saude = scanner.nextBoolean();
        scanner.nextLine();
    }

    public boolean isApto() {
        return (sexo == 'M' || sexo == 'm') && idade >= 18 && saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }
}
