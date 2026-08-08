package AlgoritmosLacosRepeticao.Classes;

import java.util.Scanner;

/**
 * 6 - Senha Correta
 * crie um programa que peça uma senha até o usuário digitar a senha correta
 * senha correta: 1234
 * conteúdo praticado: while, String equals().
 */
public class SenhaCorreta {
    public static void executarVerificacao(){
        Scanner leitor = new Scanner (System.in);
        String senhaCorreta = "1234";

        System.out.println("Digite a senha para login: ");
        String senhaLogin = leitor.nextLine();

        while(!senhaLogin.equals(senhaCorreta)){
            System.out.println("Senha incorreta!");
            System.out.println("Digite a senha para login: ");
            senhaLogin = leitor.nextLine();
        }
        System.out.println("Senha correta!");
    }
}
