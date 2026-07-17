package AlgoritmosSequenciais;

import AlgoritmosSequenciais.Classes.*;

import java.util.Scanner;

public class StartSequencial {
    public static void executarSequencial() {
        Scanner input = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("Escolha uma das opções abaixo:\n" +
                    "1 - Cadastro Simples de Pessoa\n" +
                    "2 - Soma de Dois Números\n" +
                    "3 - Calculadora Básica Sequencial\n" +
                    "4 - Cálculo de Média de notas\n" +
                    "5 - Cálculo de Salário Mensal\n" +
                    "0 - Fechar Programa\n");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    cadastroSimples.executarCadastro();
                    break;
                case 2:
                    soma.calcular();
                    break;
                case 3:
                    calculadoraSequencial.executarCalculadora();
                    break;
                case 4:
                    calcularMedia.executarCalculo();
                    break;
                case 5:
                    calcularSalario.executarSalario();
            }
        }while(opcao != 0);
    }
}
