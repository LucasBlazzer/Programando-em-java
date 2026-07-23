package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 3 - Sistema de aprovação de aluno.
 * Objetivo: peça o nome do aluno e três notas. Calcule a média e informe a situação.
 */
public class AprovaAluno {
    public static void executarResultados(){
        Scanner leitor = new Scanner(System.in);

        //Recebe o nome do aluno.
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();

        //Recebe as notas desse aluno.
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = leitor.nextDouble();

        //Faz o calculo da média das três notas e armazenando o resultado.
        double resultado = (nota1 + nota2 + nota3) / 3;
        if (resultado >= 6){
            System.out.println("Aprovado");
        } else if (resultado < 6 || resultado >= 4) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
