package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 7 - Soma até o usuário digitar zero.
 * crie um programa que peça números ao usuário. O programa deve continuar somando até o usuário digitar zero.
 */
public class SomaAteZero {
    public static void executarSomaZero(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor = leitor.nextInt();
        int soma = 0;
        while (valor != 0){
            int cont = valor;

            soma = soma + cont;

            System.out.println("Digite o segundo valor:");
            valor = leitor.nextInt();
        }
        System.out.println("O valor total da soma dos números digitados foi de: "+soma);
    }
}
