package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 2 - Soma de Dois Números
 * Objetivo - Criar um programa que leia dois números inteiros e mostre a soma.
 * Conteúdo praticado: int, operador +, entrada de dados.
 */

public class soma {
    public static void calcular() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiro = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundo = leitor.nextInt();

        int soma = primeiro + segundo;

        System.out.println("A soma de : " + primeiro + " + " + segundo + " = " + soma);
    }
}
