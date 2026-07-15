package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * Faça um algoritmo que faça a multiplicação entre duas variáveis.
 * Lembre-se que o usuário deve passar o valor da variáveis que serão multiplicadas.
 */
public class multiplicacao {
    public static void executarMultiplicacao(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao algoritmo de multiplicação de variáveis.\n" +
                "Por favor digite o valor da primeira variável: ");
        int primeiraVariavel = input.nextInt();

        System.out.println("Por favor, digite o valor da segunda variável: ");
        int segundaVariavel = input.nextInt();

        int resultado = primeiraVariavel * segundaVariavel;

        System.out.println("O resultado da multiplicação é de:\n" +
                primeiraVariavel + " x " + segundaVariavel + " = " + resultado);
    }
}
