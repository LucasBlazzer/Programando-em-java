package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 5 - Verificador de par ou Ímpar
 * objetivo: peça um número inteiro e informe se ele é par ou ímpar.
 * Regra: use o operador %
 */
public class ParImpar {
    public static void executarVerificadorParImpar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = leitor.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número "+ num + " é par!");
        }else{
            System.out.println("O número " + num + " é ímpar!");
        }
    }
}
