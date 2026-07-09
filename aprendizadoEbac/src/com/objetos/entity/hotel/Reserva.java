package com.objetos.entity.hotel;

public class Reserva {

    //Dados do objeto
    private String nomeDoHospede;
    private String tipoDeQuarto;
    private int diasEstadia;
    private double valorDiaria;


    //Construtor
    public Reserva(String nomeDoHospede, String tipoDeQuarto, int diasEstadia, double valorDiaria) {
        this.setNomeDoHospede(nomeDoHospede);
        this.setTipoDeQuarto(tipoDeQuarto);
        this.setDiasEstadia(diasEstadia);
        this.setValorDiaria(valorDiaria);
    }

    //Contrutor sobrecarga
    public Reserva(String nomeDoHospede, String tipoDeQuarto) {
        this.setNomeDoHospede(nomeDoHospede);
        this.setTipoDeQuarto(tipoDeQuarto);
        this.diasEstadia = 1;
        this.valorDiaria = 1.0;
    }

    public String getNomeDoHospede() {
        return nomeDoHospede;
    }

    public void setNomeDoHospede(String nomeDoHospede) {
        if (nomeDoHospede == null || nomeDoHospede.isBlank()) {
            throw new IllegalArgumentException("Preencha o nome do hóspede.");
        }

        this.nomeDoHospede = nomeDoHospede;
    }

    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(String tipoDeQuarto) {
        if (tipoDeQuarto == null || tipoDeQuarto.isBlank()) {
            throw new IllegalArgumentException("Selecione o tipo de quarto desejado.");
        }

        this.tipoDeQuarto = tipoDeQuarto;
    }

    public int getDiasEstadia() {
        return diasEstadia;
    }

    public void setDiasEstadia(int diasEstadia) {
        if (diasEstadia < 1) {
            throw new IllegalArgumentException("O número de dias precisa ser no mínimo 1.");
        }

        this.diasEstadia = diasEstadia;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária precisa ser maior que zero.");
        }

        this.valorDiaria = valorDiaria;
    }

    public double calcularValorTotal() {
        return diasEstadia * valorDiaria;
    }

    @Override
    public String toString() {
        return "Reserva:\n" +
                "Nome do hóspede: " + nomeDoHospede + "\n" +
                "Tipo de quarto reservado: " + tipoDeQuarto + "\n" +
                "Tempo de estadia: " + diasEstadia + " dia(s)\n" +
                "Valor da diária: R$ " + String.format("%.2f", valorDiaria) + "\n" +
                "Valor total da reserva: R$ " + String.format("%.2f", calcularValorTotal());
    }
}