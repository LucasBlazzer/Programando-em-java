package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 4 - Calculadora com escolha de operação
 * Objetivo: Peça dois números e uma operação matemática.
 * use para o menu de escolhas o switch-case.
 */
public class Calculadora {
    public static void executarCalculadora(){
        Scanner leitor = new Scanner(System.in);

        int opcao;
        System.out.println("Digite a primeira variável para calcular: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite a segunda variável para calcular: ");
        int num2 = leitor.nextInt();
        System.out.println("Digite a opção de operação desejada:\n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Dividir");
        opcao = leitor.nextInt();
        switch(opcao){
            case 1:
                int resultado = num1 + num2;
                System.out.println("A soma de: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("A subtração de: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("A multiplicação de: " + num1 + " X " + num2 + " = " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("A Dividir de: " + num1 + " / " + num2 + " = " + resultado);
                break;
        }
    }
}
