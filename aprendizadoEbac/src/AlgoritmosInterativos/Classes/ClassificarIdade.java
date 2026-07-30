package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 9 - Classificação de Idade;
 * Objetivo: Peça o nome e a idade da pessoa. Depois, classifique a fase da vida.
 */
public class ClassificarIdade {
    //0 a 12 anos -> Criança;
    // 13 a 17 anos -> Adolescente;
    //18 a 59 anos -> Adulto;
    //60 ou mais -> Idoso;
    public static void excutarClassificacao(){
        Scanner leitor = new Scanner(System.in);

        //Recebe o nome do usuário;
        System.out.println("Digite seu nome: ");
        String userName = leitor.nextLine();

        //Recebe a idade do usuário para a classificação de idade;
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        //Lógica da classificação de idade de usuário.
        if(idade >= 0 && idade <= 12){
            System.out.println("Criança");
        } else if(idade > 12 && idade <= 17){
            System.out.println("Adolescente");
        }else if(idade >=17 && idade <= 59){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
