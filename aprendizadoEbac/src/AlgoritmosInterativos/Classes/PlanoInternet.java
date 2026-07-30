package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 10 - Sistema de escolha de plano de internet
 * Objetivo: Crie um sistema onde o usuário escolhe um plano de internet.
 * menu:
 * 1 - Plano básico - 100mb - R$ 79,90
 * 2 - Plano Intermediário - 300mb - R$ 119,90
 * 3 - Plano Avançado - 600mb - R$ 159,90
 * 4 - Plano Gamer - 1GB- R$ 199,90
 *
 *
 */
public class PlanoInternet {
    public static void executarIntenet(){
        Scanner leitor = new Scanner(System.in);
        int plano;
        //Apresenta as opções para o usuário para a entrada do menu
        System.out.println("Escolha um dos planos de internet abaixo:\n" +
                "1 - Plano básico - 100mb - R$ 79,90\n" +
                "2 - Plano Intermediário - 300mb - R$ 119,90\n" +
                "3 - Plano Avançado - 600mb - R$ 159,90\n" +
                "4 - Plano Gamer - 1 Gb - R$ 199,90");
        plano = leitor.nextInt();

        // Switch-case irá pegar a opção digitada pelo usuário e colocará dentro de uma das case cadastrando a opção que o usuário quer contratar.
        switch(plano){
            case 1:
                String tipoPlano = "Plano Básico";
                String velocidadePlano = "100 MB";
                double valorPlano = 79.90;
                System.out.println("|=====Plano escolhido foi: =====|");
                System.out.println("Plano: "+tipoPlano);
                System.out.println("Velocidade do Plano contratado: "+velocidadePlano);
                System.out.println("Valor da mensalidade do plano contratado: R$ "+valorPlano);
                System.out.println("|====================================|");
                break;
            case 2:
                tipoPlano = "Plano Intermediário";
                velocidadePlano = "300 MB";
                valorPlano = 119.90;
                System.out.println("Plano escolhido foi: ");
                System.out.println("Plano: "+tipoPlano);
                System.out.println("Velocidade do Plano contratado: "+velocidadePlano);
                System.out.println("Valor da mensalidade do plano contratado: R$ "+valorPlano);
                break;
            case 3:
                tipoPlano = "Plano Avançado";
                velocidadePlano = "600 MB";
                valorPlano = 159.90;
                System.out.println("Plano escolhido foi: ");
                System.out.println("Plano: "+tipoPlano);
                System.out.println("Velocidade do Plano contratado: "+velocidadePlano);
                System.out.println("Valor da mensalidade do plano contratado: R$ "+valorPlano);
                break;
            case 4:
                tipoPlano = "Plano Gamer";
                velocidadePlano = "1 GB";
                valorPlano = 199.90;
                System.out.println("Plano escolhido foi: ");
                System.out.println("Plano: "+tipoPlano);
                System.out.println("Velocidade do Plano contratado: "+velocidadePlano);
                System.out.println("Valor da mensalidade do plano contratado: R$ "+valorPlano);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
