package AlgoritmosLacosRepeticao;

import AlgoritmosLacosRepeticao.Classes.Contagem;
import AlgoritmosLacosRepeticao.Classes.ContagemRegressiva;
import AlgoritmosLacosRepeticao.Classes.SomaNumeros;
import AlgoritmosLacosRepeticao.Classes.Tabuada;

import java.util.Scanner;

public class startLacos {
    public static void executarRepeticoes(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:\n" +
                "1 - Contagem\n" +
                "2 - Contagem Regressiva\n" +
                "3 - Tabuada\n" +
                "4 - Soma de números de 1 até N\n");
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
        }
    }
}
