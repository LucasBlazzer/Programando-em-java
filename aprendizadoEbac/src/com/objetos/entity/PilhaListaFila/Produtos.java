package com.objetos.entity.PilhaListaFila;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        //Verificação se os elementos do objetos não estão vazios.
        if(nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }else{
            this.nome = nome;
        }

        if(preco <= 0){
            throw new IllegalArgumentException("Cadastro de preço Inválido!");
        }else{
            this.preco = preco;
        }

        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade cadastrada inválida!");
        }else{
            this.quantidade = quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
