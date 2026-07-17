package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 10 - Cálculo de dias de vida aproximados
 * Objetivo: Ler o nome e a idade de uma pessoa e calcular aproximadamente quantos dias ela já viveu.
 *
 */
public class calculoDeVida {
    public static void executarCalculo() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();

        int idadeDias = idade * 365;

        System.out.println("\n=====CÁLCULO EFETUADO COM SUCESSO!=====");
        System.out.println("Seu Nome: " +nome);
        System.out.println("Seu Idade: " +idadeDias);
        System.out.println("Dias vividos aproximadamente: " + idadeDias);
        System.out.println("=========================================");
    }
}
