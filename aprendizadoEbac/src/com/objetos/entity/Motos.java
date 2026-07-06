package com.objetos.entity;

public class Motos {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Motos(String marca, String modelo, int ano, double preco) {
        if (marca != null && modelo != null && ano <= 1950 && ano >= 2030 && preco != 0) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.preco = preco;
        } else {
            Exception ex = new Exception("Nenhum registro foi encontrado");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0 ){
            Exception ex = new Exception("Valor inválido!");
        }else{
            this.preco = preco;
        }
    }
}
