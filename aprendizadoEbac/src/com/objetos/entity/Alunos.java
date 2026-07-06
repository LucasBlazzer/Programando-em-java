package com.objetos.entity;

import java.util.Arrays;

public class Alunos {

    private String nome;
    private int idade;
    private double[] notas;

    public Alunos(String nome, int idade, int quantidadeNotas) {
        //Validação do nome do aluno.
        if (nome != null){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome Inválida.");
        }

        //Validação da idade do aluno.
        if (idade != 0){
            this.idade = idade;
        }else {
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.notas = new double[quantidadeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean adicionarNota(int posicao, double nota) {
        if (nota < 0 || nota > 10) {
            return false;
        }

        this.notas[posicao] = nota;
        return true;
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();
        System.out.println("Média: " + calcularMedia());
    }
}