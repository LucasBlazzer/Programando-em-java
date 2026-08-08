package AlgoritmosLacosRepeticao;

import AlgoritmosLacosRepeticao.Classes.*;

import java.util.Scanner;

public class startLacos {
    public static void executarRepeticoes(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:\n" +
                "1 - Contagem\n" +
                "2 - Contagem Regressiva\n" +
                "3 - Tabuada\n" +
                "4 - Soma de números de 1 até N\n" +
                "5 - Mostrar somente os números pares\n" +
                "6 - Senha Correta\n" +
                "7 - Soma até digitar o numero zero\n" +
                "8 - Contador de números positivos\n" +
                "9 - Menu Simples com While\n" +
                "10 - Menu de calculadora\n" +
                "11 - Cadastro repetido de pessoas\n" +
                "12 - Validação de notas\n" +
                "13 - Média de vários Alunos");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
                Contagem.executarContagem();
                break;
            case 2:
                ContagemRegressiva.executarRegressiva();
                break;
            case 3:
                Tabuada.executarTabuada();
                break;
            case 4:
                SomaNumeros.executarSoma();
                break;
            case 5:
                MostrarPares.executarMostrarPares();
                break;
            case 6:
                SenhaCorreta.executarVerificacao();
                break;
            case 7:
                SomaAteZero.executarSomaZero();
                break;
            case 8:
                ContadorPositivo.executarContatorPositivo();
                break;
            case 9:
                MenuWhile.executarMenuWhile();
                break;
        }
    }
}
