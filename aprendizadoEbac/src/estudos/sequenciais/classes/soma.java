package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * Crie um algoritmo que faça a soma de duas variáveis e mostre o resultado desta conta.
 */
public class soma {
    public static void executarSoma(){
        Scanner leitorSoma = new Scanner(System.in);

        System.out.println("Bem-vindo!\n" +
                "Esse algoritmo fará a soma de duas variáveis.\n" +
                "Por favor digite o valor da primeira variável: ");
        int variavel_1 = leitorSoma.nextInt();

        System.out.println("Por favor digite o valor da segunda variável: ");
        int variavel_2 = leitorSoma.nextInt();

        int resultado = variavel_1 + variavel_2;

        System.out.println("O resultado da soma é de: \n" +
                variavel_1 + " + " + variavel_2 + " = " + resultado);

    }

}
