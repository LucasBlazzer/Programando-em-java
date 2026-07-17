package AlgoritmosSequenciais;

import AlgoritmosSequenciais.Classes.*;

import java.util.Scanner;

/**
 * Aqui temos 10 exercícios de algoritmos sequenciais onde aprendemos a usar algumas variaveis.
 * Utilizamos também alguns métodos e conversões e calculos de variáveis e recebimento de dados pelo usuário.
 */
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
                    "6 - Conversão de Unidades (m, cm, mm)\n" +
                    "7 - Cálculo de área (Retângulo)\n" +
                    "8 - Cálculo de valor total de uma compra\n" +
                    "9 - Conversor de Temperatura\n" +
                    "10 - Dias de Vividos" +
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
                    break;
                case 6:
                    conversaoMetrosCentMilim.executarConversao();
                    break;
                case 7:
                    calculoAreaRetangulo.executarCalculo();
                    break;
                case 8:
                    calculoCompra.executarCalculo();
                    break;
                case 9:
                    conversaoTemperatura.executarConversao();
                    break;
                case 10:
                    calculoDeVida.executarCalculo();
                    break;
                case 0:
            }
        }while(opcao != 0);
    }
}
