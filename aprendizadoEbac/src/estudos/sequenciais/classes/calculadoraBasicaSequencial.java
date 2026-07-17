package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * CALCULADORA BÁSICA SEQUENCIAL
 * Objetivo: ler dois número e exibir: soma, subtração, multiplicação e divisão.
 * Use double para permitir divisão com casas decimais.
 */
public class calculadoraBasicaSequencial {
    public static void executarCalculadoraBasicaSequencial(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da primeira variável e vamos calcular: ");
        double variavel1 = leitor.nextDouble();

        System.out.println("Digite o valor da segunda variável e vamos calcular: ");
        double variavel2 = leitor.nextDouble();

        //Soma
        double Soma = variavel1 + variavel2;

        //Subtração
        double subtracao = variavel1 - variavel2;

        //Multiplicação
        double multiplicacao = variavel1 * variavel2;

        //Divisão
        double divisao = variavel1 / variavel2;

        System.out.println("Soma de: " +variavel1+" + "+variavel2 + " = " + Soma);
        System.out.println("Subtração de: " + variavel1 + " - " + variavel2 + " = " + subtracao);
        System.out.println("Multiplicação de: " + variavel1 + " * " + variavel2 + " = " + multiplicacao);
        System.out.println("Divisão de: " + variavel1 + " / " + variavel2 + " = " + divisao);
    }
}
