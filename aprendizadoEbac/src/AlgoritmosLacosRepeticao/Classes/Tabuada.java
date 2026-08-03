package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 3 - Tabuada
 * Peça um número ao usuário e mostre a tabuada dele de 1 até 10.
 */
public class Tabuada {
    public static void executarTabuada(){
        Scanner leitor = new Scanner(System.in);

        //Solicitação do número que será executado a tabuada.
        System.out.println("Digite um número para fazer a tabuada: ");
        int num = leitor.nextInt();

        //Execução da tabuada
        for (int i = 0; i <= 10; i++){
            int resultado = num * i;
            System.out.println(resultado);
        }
    }
}
