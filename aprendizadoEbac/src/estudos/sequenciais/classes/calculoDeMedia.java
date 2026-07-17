package estudos.sequenciais.classes;

import java.util.Scanner;

/**
 * CÁLCULO DE MÉDIA DE NOTAS
 * Objetivo: Ler três notas de um aluno e calcular a média.
 */
public class calculoDeMedia {

    public static void exercutarCalculoDeMedia(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nome do Aluno: " + nomeAluno +"\n" +
                "Média: " + media);
    }
}
