package com.objetos.entity.colecaoComparacaoObjetosControleDuplicidade;

import java.util.Objects;//Essa linha importa a classe Objects.

/**
 * Ela será usada nas seguintes linhas:
 * Objects.equals(nome,pessoa.nome);
 * Objects.hash(nome, idade);
 * Ela ajuda a comparar objetos e gerar a hashCode() de forma mais segura.
 */

public class Pessoa {
    private String nome;
    private int idade;



    //Esse é o construtor da classe. Ele é chamado quando você faz um novo cadastro de pessoa.
    public Pessoa(String nome, int idade) {
        this.nome = nome;

        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Pessoa pessoa = (Pessoa) objeto;

        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}
