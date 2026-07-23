package AlgoritmosInterativos;

import AlgoritmosInterativos.Classes.PositivoNegativoZero;
import AlgoritmosInterativos.Classes.VerificadorMaioridade;

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
                    "1 - Verificador de Maioridade\n" +
                    "2 - Positivo Negativo Zero\n " +
                    "0 - sair\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    VerificadorMaioridade.executarVerificadorMaioridade();
                    break;
                case 2:
                    PositivoNegativoZero.executarPositivoNegativoZero();
                    break;
                case 0:
                    System.out.println("Fechando Programa ....");
                    break;
            }
        }while (opcao != 0);
    }
}
