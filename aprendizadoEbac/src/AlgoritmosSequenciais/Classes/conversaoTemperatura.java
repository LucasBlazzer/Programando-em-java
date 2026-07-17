package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 9 - Conversão de Temperatura
 * Objetivo: Converter uma temperatura de Celsius para Fahrenheit.
 * fórmula: fahrenheit = (celsius * 9 / 5) + 32
 */
public class conversaoTemperatura {
    public static void executarConversao() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura: ");
        double c = input.nextDouble();

        double f = (c * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é de : "+ f + "f°\n");
    }
}
