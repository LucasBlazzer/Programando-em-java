package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 10 - Menu calculadora
 * Crie um programa que faça um menu com as principais operações aritimeticas.
 */
public class Calculadora {
    public static void executarMenuCalculadora(){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            mensagem();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da primeira variável: ");
                    int num1 = leitor.nextInt();
                    System.out.println("Digite o valor da segunda variável: ");
                    int num2 = leitor.nextInt();

                    int soma = num1 + num2;
                    System.out.println("O resultada soma de: " + num1 + " + " + num2 + " = " + soma);
                    break;
                case 2:
                    System.out.println("Digite o valor da primeira variável: ");
                    num1 = leitor.nextInt();
                    System.out.println("Digite o valor da segunda variável: ");
                    num2 = leitor.nextInt();

                    int subtracao = num1 - num2;
                    System.out.println("O resultada Subtração é de: " + num1 + " - " + num2 + " = " + subtracao);
                    break;
                case 3:
                    System.out.println("Digite o valor da primeira variável :");
                    num1 = leitor.nextInt();
                    System.out.println("Digite o valor da segunda variável: ");
                    num2 = leitor.nextInt();
                    int multiplicacao = num1 * num2;
                    System.out.println("O resultada da multiplicação é de: " + num1 + " X " + num2 + " = " + multiplicacao);
                    break;
                case 4:
                    System.out.println("Digite o valor da primeira variável: ");
                    num1 = leitor.nextInt();
                    System.out.println("Digite o valor da segunda variável ");
                    num2 = leitor.nextInt();
                    int divisao = num1 / num2;
                    System.out.println("O resultado da divisão é de: " + num1 + " / " + num2 + " = " + divisao);
                    break;
                case 0:
                    System.out.println("Fechando o programa ...");
                    break;
                default:
                    System.out.println("Valor de opção inválida!");
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }while (opcao != 0);
    }

    private static void mensagem() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Division");
        System.out.println("0 - Sair");
    }
}
