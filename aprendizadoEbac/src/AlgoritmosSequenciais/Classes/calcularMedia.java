package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 *  4 - Cálculo de Média de Notas.
 *  Objetivo; Ler três notas de um aluno e calular a média.
 *  Conteúdo praticado: double, operações aritméticas, precedência com parênteses.
 */
public class calcularMedia {
    public static void executarCalculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nomeAluno = input.nextLine();

        System.out.println("Digite a primeira nota do Aluno: ");
        double n1 = input.nextDouble();

        System.out.println("Digite a segunda nota do Aluno: ");
        double n2 = input.nextDouble();

        System.out.println("Digite a terceira nota do Aluno: ");
        double n3 = input.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("\n=====NOTAS DOS ALUNOS=====\n");
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println("==============================\n");
    }
}
