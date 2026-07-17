import AlgoritmosInterativos.startInterativos;
import AlgoritmosSequenciais.StartSequencial;

import java.util.Scanner;

/**
 * Criado Por Lucas da Silva Carvalho
 * Sistema de Aprendizagem de algoritmos em Java.
 * Essa primeira classe é o ponto de partida para o desenvolvimento de aplicações java mais organizada e coesas.
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Importação da classe Scanner. Essa classe é importante para podermos receber dados digitados pelo usuário.
         */
        Scanner leitor = new Scanner(System.in);
        /**
         * aqui temos a declaração de variáveis em Java.
         * Nessa linha estaremos recebendo um número inteiro do usuário para que o algoritmo pode ser executado.
         */
        int opcao;

        do{
            /**
             * Aqui começaremos uma pequena lógica para que o menu de innteração fique rodando até que o usuário digite a opção de saída.
             * do-while: laço de repetição que garante que o código fique rodando até atingir a codição necessária de saída.
             * System.out.println: imprime uma mensagem para o usuário para que ele tenha uma interação com o algoritmo.
             * switch-case: menu de interação.
             */
            System.out.println("Digite a opção abaixo desejada:\n" +
                    "1 - Algoritmo Sequenciais\n" +
                    "2 - Algoritmos Interativos\n" +
                    "3 - Algoritmos de Laços de Repetição\n" +
                    "4 - Algoritmo de Vetores\n" +
                    "5 - Algoritmo de Matrizes\n" +
                    "6 - Algoritmo de Orientação a Objetos\n" +
                    "7 - Técnicas e Conseitos Avançados\n" +
                    "8 - Recursos Avançados\n" +
                    "9 - Banco de Dados e Marven\n" +
                    "10 - Spring Boot\n" +
                    "11 - Realizando Testes de Software e NoSQL\n" +
                    "12 - Arquitetura Moderna, Microsserviços e Cloud\n" +
                    "13 - Final da Jornada\n" +
                    "0 - Fechar Programa\n");
            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    StartSequencial.executarSequencial();
                    break;
                case 2:
                    startInterativos.executarInterativos();
            }
        }while(opcao != 0);
        leitor.close();
    }
}
