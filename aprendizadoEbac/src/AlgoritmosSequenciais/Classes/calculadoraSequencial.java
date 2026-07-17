package AlgoritmosSequenciais.Classes;


import java.util.Scanner;

/**
 * 3 - Calculadora Básica Sequencial
 * Objetivo: Ler dois números e exibir: soma, subtração multiplicação e divisão
 *
 */
public class calculadoraSequencial {
    public static void executarCalculadora() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira variável que será calculada: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segunda variável que será calculada: ");
        double num2 = leitor.nextDouble();

        //faz os calculos usando os números passados pelo usuário.
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;


        //Faz a impressão dos calculos e exibindo para o usuário.
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtracao: " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println("Multiplicacao: " + num1 + " X " + num2 + " = " + multiplicacao);
        System.out.println("Divisao: " + num1 + " / " + num2 + " = " + divisao);
    }
}
