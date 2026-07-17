package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 6 - Conversão de Metros para Centímetros e Milímetros.
 * Objetivo: Ler um valor em metros e converter para centímetros e milímetros.
 */
public class conversaoMetrosCentMilim {
    public static void executarConversao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos metros você quer converter: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("\n=====RESULTADO DA CONVERSÃO=====");
        System.out.println("Metros: " + metros);
        System.out.println("Centimetros: " + centimetros);
        System.out.println("Milimetros: " + milimetros);
        System.out.println("|================================|");
    }
}
