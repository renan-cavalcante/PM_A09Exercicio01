package com.example.pm_a09exercicio01.model;

import java.time.LocalDate;

public abstract class Atetla {
    private String nome;
    private LocalDate dataNasc;
    private String bairro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nome:").append(nome);
        sb.append(", dataNasc:").append(dataNasc);
        sb.append(", bairro:").append(bairro);
        return sb.toString();
    }
}
