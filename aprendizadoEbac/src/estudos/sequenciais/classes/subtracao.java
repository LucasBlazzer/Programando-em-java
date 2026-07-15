package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * Crie um algoritmo que faça um calculo de subtração entre duas variáveis.
 * As variáveis devem ser digitadas pelo usuário.
 */
public class subtracao {
    public static void executarSubtracao(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ola, esse algoritmo faz conta de subtração!\n" +
                "Por favor digite o valor da primeira variável: ");
        int variavel1 = input.nextInt();

        System.out.println("Por favor digite o valor da segunda variável: ");
        int variavel2 = input.nextInt();

        int resultado = variavel1 - variavel2;

        System.out.println("O resultado da subtração entre: \n" +
                variavel1 + " - " + variavel2 + " = " + resultado);
    }
}
