package com.example.pm_a09exercicio01.model;

public class AtetlaPleno extends  Atetla{
    private String academia;
    private Float record;

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public Float getRecord() {
        return record;
    }

    public void setRecord(Float record) {
        this.record = record;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", academia:").append(academia);
        sb.append(", record:").append(record);
        return sb.toString();
    }
}
