package br.com.desafio.dominio;

import java.time.LocalDate;

public class Empretimo {

    protected static final int QTD_PARCELA = 60;

    private double valorEmprestimo;
    private LocalDate dataPrimeiraParcela;
    private int parcela = 0;


    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public LocalDate getDataPrimeiraParcela() {
        return dataPrimeiraParcela;
    }

    public void setDataPrimeiraParcela(LocalDate dataPrimeiraParcela) {
        this.dataPrimeiraParcela = dataPrimeiraParcela;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public void totalParcela(){
        if(parcela > QTD_PARCELA){
            System.out.println("Número max de parcelas excedido");
        }else{
            System.out.println("Números de parcelas permitido");
        }
    }

    @Override
    public String toString() {
        return "Empretimo{" +
                "valorEmprestimo=" + valorEmprestimo +
                ", dataPrimeiraParcela=" + dataPrimeiraParcela +
                ", parcela=" + parcela +
                '}';
    }
}
