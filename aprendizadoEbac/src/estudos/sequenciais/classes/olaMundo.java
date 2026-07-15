package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * Escreva um algoritmo que escreva uma mensagem na tela para o usuário com os seguintes comandos:
 * 1 - peça o nome do usuário;
 * 2 - Escreva a frase "Ola mundo, sejam bem vindo ao mundo Java + nome digitado pelo usuário."
 */
public class olaMundo {
    public static void executar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ola, poderia digitar seu nome:");
        String nome = input.nextLine();

        System.out.println("Ola mundo, seja bem vindo ao mundo de programação Java " + nome +" será mundo bom te ter aqui!");

    }
}
