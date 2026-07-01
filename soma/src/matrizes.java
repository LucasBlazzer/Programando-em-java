import java.util.Arrays;
import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de aprendizado de matrizes.\n" +
                "Por favor digite uma das opções abaixo:\n" +
                "1 - Apredizado de Matrizes:\n" +
                "2 - Operações com Matrizes:\n");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                aprendizadoDeMatrizes();
                break;
            case 2:
                operacoesAritmeticasComMatrizes();
                break;
        }
    }

    private static void operacoesAritmeticasComMatrizes() {
        //Faça um algortmo que faça operações matemáticas usando os valores armazenados na matriz;
        Scanner input = new Scanner(System.in);
        int linhas, colunas;
        System.out.println("Digite o valor das linhas da matriz: ");
        linhas = input.nextInt();

        System.out.println("Digite o valor das colunas da matriz: ");
        colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                System.out.println("Digite um valor: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("Digite uma das opções abaixo:\n" +
                "1 - Soma:\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                //EScolha 1
                System.out.println("Escolha uma linha:");
                int linhaEscolhida = input.nextInt();
                System.out.println("Escolha uma coluna:");
                int colunaEscolhida = input.nextInt();

                //Escolha 2
                System.out.println("EScolha outra linha:");
                int linhaEScolhida_2 = input.nextInt();
                System.out.println("Escolha outra coluna:");
                int colunaEScolhida_2 = input.nextInt();
                int resultado = matriz[linhaEscolhida][colunaEscolhida] + matriz[linhaEScolhida_2][colunaEScolhida_2];

                System.out.println(" Soma de: " + matriz[linhaEscolhida][colunaEscolhida] + " + " + matriz[linhaEScolhida_2][colunaEScolhida_2] + " = " + resultado);
                break;
            case 2:
                //EScolha 1
                System.out.println("Escolha uma linha:");
                linhaEscolhida = input.nextInt();
                System.out.println("Escolha uma coluna:");
                colunaEscolhida = input.nextInt();

                //Escolha 2
                System.out.println("EScolha outra linha:");
                linhaEScolhida_2 = input.nextInt();
                System.out.println("Escolha outra coluna:");
                colunaEScolhida_2 = input.nextInt();
                resultado = matriz[linhaEscolhida][colunaEscolhida] - matriz[linhaEScolhida_2][colunaEScolhida_2];

                System.out.println(" Subtração de: " + matriz[linhaEscolhida][colunaEscolhida] + " - " + matriz[linhaEScolhida_2][colunaEScolhida_2] + " = " + resultado);
                break;
            case 3:
                //EScolha 1
                System.out.println("Escolha uma linha:");
                linhaEscolhida = input.nextInt();
                System.out.println("Escolha uma coluna:");
                colunaEscolhida = input.nextInt();

                //Escolha 2
                System.out.println("EScolha outra linha:");
                linhaEScolhida_2 = input.nextInt();
                System.out.println("Escolha outra coluna:");
                colunaEScolhida_2 = input.nextInt();
                resultado = matriz[linhaEscolhida][colunaEscolhida] * matriz[linhaEScolhida_2][colunaEScolhida_2];

                System.out.println(" A multiplicação de: " + matriz[linhaEscolhida][colunaEscolhida] + " X " + matriz[linhaEScolhida_2][colunaEScolhida_2] + " = " + resultado);
                break;
            case 4:
                //EScolha 1
                System.out.println("Escolha uma linha:");
                linhaEscolhida = input.nextInt();
                System.out.println("Escolha uma coluna:");
                colunaEscolhida = input.nextInt();

                //Escolha 2
                System.out.println("EScolha outra linha:");
                linhaEScolhida_2 = input.nextInt();
                System.out.println("Escolha outra coluna:");
                colunaEScolhida_2 = input.nextInt();
                resultado = matriz[linhaEscolhida][colunaEscolhida] / matriz[linhaEScolhida_2][colunaEScolhida_2];

                System.out.println(" Divisão de: " + matriz[linhaEscolhida][colunaEscolhida] + " / " + matriz[linhaEScolhida_2][colunaEScolhida_2] + " = " + resultado);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }

    private static void aprendizadoDeMatrizes() {
        Scanner input = new Scanner(System.in);
        int linhas, colunas;

        System.out.println("Digite quantas linhas a Matriz deve ter:\n");
        linhas = input.nextInt();

        System.out.println("Digite quantas colunas a Matriz deve ter:\n");
        colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um valor para ser alocado na matriz:");
                matriz[linha][coluna] = input.nextInt();
                System.out.println(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(matriz));
    }
}
