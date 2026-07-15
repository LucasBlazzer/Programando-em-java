package estudos.sequenciais;

import estudos.sequenciais.classes.multiplicacao;
import estudos.sequenciais.classes.olaMundo;
import estudos.sequenciais.classes.soma;
import estudos.sequenciais.classes.subtracao;

import java.util.Scanner;

/**
 * Aqui estarei chamando todos os algoritmos de execícios sequencias.
 */
public class chamaClassesSequencial {
    public static void executarProgramaSequencial(){
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Bem vindo ao programa de exercícios Java Sequencial\n");
            System.out.println("Digite uma das opções abaixos:\n " +
                    "1 - Ola, mundo + nome do usuário\n" +
                    "2 - Soma de variáveis\n" +
                    "3 - Subtração de variáveis\n" +
                    "4 - Multiplicação de variáveis\n" +
                    "0 - sair");
            opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao){
                case 1:
                    olaMundo.executar();
                    break;
                case 2:
                    soma.executarSoma();
                    break;
                case 3:
                    subtracao.executarSubtracao();
                    break;
                case 4:
                    multiplicacao.executarMultiplicacao();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(opcao != 0);

    }
}
