package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 1 - Cadastro Simples de Pessoa
 * Obejtivo: Criar um progrma que leia os dados básicos de uma pessoa e exiba tudo no console.
 * Conteúdos praticados: String, int, Scanner, System.out.prinln
 */
public class cadastroSimples {
    public static void executarCadastro() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa que deseja cadastrar: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade da pessoa que deseja cadastrar: ");
        int idade = leitor.nextInt();
        leitor.nextLine(); // Consome o Enter pendente

        System.out.println("Digite a cidade onde a pessoa cadastrada mora: ");
        String cidade = leitor.nextLine();

        System.out.println("Digite o estado(UF) onde a pessoa cadastrada mora: ");
        String estado = leitor.nextLine();

        System.out.println("\n=====PESSOA CADASTRADA=====\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("=====================================\n");
    }
}
