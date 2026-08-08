package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 9 - Menu Simples com While
 * crie um menu que só encerra quando o usuário escolher 0;
 * o que o menu deve mostrar:
 * 1 - Dizer Ola;
 * 2  - Mostrar uma Mensagem motivacional;
 * 3 - Mostrar o nome do programador;
 * 0 - Fechar o programa.
 */
public class MenuWhile {
    public static void executarMenuWhile(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Receber uma saudação\n" +
                "2 - Mostrar uma mensagem motivacional\n" +
                "3 - Mostrar o nome do desenvolvedor do programa\n" +
                "0 - Fechar o programa");
        int opcao = leitor.nextInt();
        while(opcao != 0){
            switch (opcao){
                case 1:
                    System.out.println("Ola bem vindo ao meu programa!");
                    break;
                case 2:
                    System.out.println("A ideia é nunca perder a motivação para subir cada degrau rumo ao sucesso, por mais difícil que seja. E também não esquecer de agradecer pelas lições aprendidas em cada etapa da jornada.");
                    break;
                case 3:
                    System.out.println("Lucas da Silva Carvalho");
                    break;
            }
        }
        System.out.println("Fechando programa ...");
    }
}
