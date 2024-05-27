package com.example.pm_a09exercicio01.model;

public class AtetlaJuvenil extends Atetla {
    private int anosPatrica;

    public int getAnosPatrica() {
        return anosPatrica;
    }

    public void setAnosPatrica(int anosPatrica) {
        this.anosPatrica = anosPatrica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", anos de patrica:").append(anosPatrica);
        return sb.toString();
    }
}
