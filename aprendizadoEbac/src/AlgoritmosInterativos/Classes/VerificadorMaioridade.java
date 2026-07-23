package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * Objetivo: Peça o nome e a idade do usuário.
 * Depois, informe se ele é maior ou menor de idade.
 */
public class VerificadorMaioridade {
    public static void executarVerificadorMaioridade(){
        Scanner leitor = new Scanner(System.in);

        //Pede o nome do usuário e adiciona na variável nomeUsuario.
        System.out.println("Digite seu nome: ");
        String nomeUsuario  =  leitor.nextLine();

        //Pede e recebe a idade do usuário acionando na variável idadeUsuario.
        System.out.println("Digite sua idade: ");
        int idadeUsuario = leitor.nextInt();

        if(idadeUsuario >= 18){
            System.out.println("Nome: "+nomeUsuario);
            System.out.println("Idade: "+idadeUsuario);
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("você é menor de idade.");
        }
    }
}
