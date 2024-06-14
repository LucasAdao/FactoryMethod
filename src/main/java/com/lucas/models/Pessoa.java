package com.lucas.models;

public class Pessoa {
    private String nome;
    private Raca raca;
    private Sexo sexo;
    private boolean ehMasculino;

    public Pessoa(){

    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean ehMasculino() {
        return ehMasculino;
    }

    public void setEhMasculino(boolean ehMasculino) {
        this.ehMasculino = ehMasculino;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nRaça: " + raca +
                "\nSexo: " + sexo;
    }
}
