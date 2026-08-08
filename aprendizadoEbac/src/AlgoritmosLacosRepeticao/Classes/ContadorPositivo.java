package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 8 - Contator de  número positivos.
 * Peça números ao usuário até ele digitar 0.
 * No final, mostre quantos números positivos foram digitados.
 */
public class ContadorPositivo {
    public static void executarContatorPositivo(){
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        while(numero !=0){
            int verificador = numero;
            System.out.println("Digite outro numero:");
            numero = sc.nextInt();
            if(verificador >= 0){
                positivos++;
            }
        }
        System.out.println("Números positivos digitados: " + positivos);
    }
}
