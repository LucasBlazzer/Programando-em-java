import estudos.*;
import estudos.recursosAvancados.colecaoComparacaoObjetosControleDuplicidade;

import java.util.Scanner;

//Esse arquivo é a classe principal do meu projeto. Aqui estou fazendo todos meus exercícios e projetos de estudos de Java.
//Aqui estará todos os projetos, exercício entre outras coisas que estou fazendo para aprender a programar.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nBem-vindo ao menu de Exercícios e Aprendizado!\n" +
                    "Digite a opção desejada:\n" +
                    "1 - Exercício de Uso de Laços de Repetição e Interativos\n" +
                    "2 - Exercícios de Vetores\n" +
                    "3 - Exercícios de Matrizes\n" +
                    "4 - Exercício de Orientação a Objetos\n" +
                    "5 - Exercício de Criação: Sistema de Controle de Reservas de Hotel\n" +
                    "6 - Exercício: Recursividade\n" +
                    "7 - Técnicas Avançadas de Programação\n" +
                    "8 - Exercício - Coleção, Comparação de Obejtos e Controle de duplicidade\n" +
                    "0 - Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    exercicioDeLacosInterativosSequenciais.executar();
                    break;

                case 2:
                    vetores.executar();
                    break;

                case 3:
                    trabalhandoComMatrizes.executar();
                    break;

                case 4:
                    cadastro.executar();
                    break;

                case 5:
                    sistemaDeControleDeReservasDeHotel.executar();
                    break;
                case 6:
                    recursividadeProgramacaoDinamica.exercutar();
                    break;
                case 7:
                    tecnicasConceitosAvancados.executar();
                    break;
                case 8:
                    colecaoComparacaoObjetosControleDuplicidade.executar();
                    break;

                case 0:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}