package com.example.pm_a09exercicio01.model;

public class AtetlaSenior extends Atetla {
    private boolean problemaCardiaco;

    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(boolean problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", problemaCardiaco:").append(problemaCardiaco);
        return sb.toString();
    }
}
