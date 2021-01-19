package br.com.alura.jpa.modelo;

public class MediaComData {

    private Double valor;
    private int dia;
    private int mes;

    public MediaComData(Double valor, int dia, int mes) {
        this.valor = valor;
        this.dia = dia;
        this.mes = mes;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }



}
