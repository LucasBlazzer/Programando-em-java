package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 7 - Sistema Simples de Login
 * Objetivo: Peça usuário e senha. Verifique se os dados estão corretos.
 * Dados Fixos: usuário correto: admin - senha correta : 1234
 * Regra: Se o usuário e senha estiverem corretos  -> Acesso permitido
 * Caso contrário -> Acesso negado.
 * Dica Para comparar String, use "usuario.equals ("admin")"
 * não use : usuario =="admin"
 */

public class SistemaLoginSimples {
    public static void executarSistemaLoginSimples(){
        Scanner leitor = new Scanner(System.in);
        String userNameCorreto ="admin";
        String senhaCorreto = "1234";

        //Solicita o nome de usuário para entrada do login.
        System.out.println("Digite o nome do usuário para o login: ");
        String userName = leitor.nextLine();;

        //Solicita a senha ao usuário para a verificação.
        System.out.println("Digite a senha para o login: ");
        String senha = leitor.nextLine();

        if(userName.equals(userNameCorreto) && senha.equals(senhaCorreto)){
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }

    }
}
