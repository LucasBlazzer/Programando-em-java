package AlgoritmosInterativos;

import AlgoritmosInterativos.Classes.*;

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
                    "2 - Positivo Negativo Zero\n" +
                    "3 - Aprovação de Alunos\n" +
                    "4 - Calculadora com escolha\n" +
                    "5 - Verificador de par ou ímpar\n" +
                    "6 - Cálculo de desconto em produto\n" +
                    "0 - sair\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    VerificadorMaioridade.executarVerificadorMaioridade();
                    break;
                case 2:
                    PositivoNegativoZero.executarPositivoNegativoZero();
                    break;
                case 3:
                    AprovaAluno.executarResultados();
                    break;
                case 4:
                    Calculadora.executarCalculadora();
                    break;
                case 5:
                    ParImpar.executarVerificadorParImpar();
                    break;
                case 6:
                    DescontoProduto.executarDesconto();
                    break;
                case 0:
                    System.out.println("Fechando Programa ....");
                    break;
            }
        }while (opcao != 0);
    }
}
