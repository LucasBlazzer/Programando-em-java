package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 4 - Soma de números de 1 até N
 * Peça um número N ao usuário e some todos os números de 1 até N.
 */
public class SomaNumeros {
    public static void executarSoma(){
        Scanner leitor = new Scanner(System.in);
        int resultado = 0 ;
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();

        for (int i = 1; i <= num; i++) {
            resultado += i;
            System.out.println(resultado);
        }
    }
}
