package AlgoritmosInterativos;

import java.util.Scanner;

/**
 * Aqui começaremos a usar algoritmos iterativos para fixar nosso aprendizado em Java.
 * Aqui aprenderemos a usar o if, else if e else.
 */
public class startInterativos {

    public static void executarInterativos() {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Digite uma das opções desejada abaixo: \n" +
                    "1 - \n" +
                    "0 - sair\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:

                    break;
                case 0:
                    System.out.println("Fechando Programa ....");
                    break;
            }
        }while (opcao != 0);
    }
}
