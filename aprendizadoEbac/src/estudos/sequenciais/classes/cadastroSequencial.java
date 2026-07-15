package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * Cadastro simples de pessoa:
 * objetivo:
 * Criar um programa que leia os dados básicos de uma pessoa e exiba tudo no console.
 * Dados de entrada: nome, idade, cidade e estado.
 * Conteúdo praticados: String, int, Scanner System.out.println
 */

public class cadastroSequencial {
    public static void executarCadastroSequencial(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite a sua idade: ");
        int idadeUsuario = leitor.nextInt();

        System.out.println("Digite a sua cidade natal: ");
        String cidadeNatal = leitor.nextLine();

        System.out.println("Digite o estado em que você nasceu: ");
        String ufUsuario = leitor.nextLine();

        System.out.println("Nome: " + nomeUsuario + "\n" +
                "Idade: " + idadeUsuario +"\n" +
                "Cidade: " + cidadeNatal + "\n" +
                "UF: " + ufUsuario);
    }
}
