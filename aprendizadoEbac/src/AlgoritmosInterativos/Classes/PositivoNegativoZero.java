package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 2-Verificador de números positivos, negativo ou zero
 * Objetivo: Peça um número inteiro e informe se ele é positivo, negativo ou zero.
 * Regras:
 * num > 0 == positivo;
 * num < 0 == negativo;
 * num == 0 == zero;
 */
public class PositivoNegativoZero {
    public static void executarPositivoNegativoZero(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o número para a comparação: ");
        int num =  leitor.nextInt();

        /**
         * Aqui estarei fazendo a comparação dos dados digitados pelo usuário.
         */
        if(num > 0){
            System.out.println(num +" esse número é positivo!");
        }else if(num < 0){
            System.out.println(num + " esse número é negativo!");
        }else{
            System.out.println("o número digitado foi zero!");
        }
    }
}
