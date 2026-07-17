package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 7 - Cálculo de área de um retângulo
 * Objetivo: Ler a largura e a altura de um retângulo e calcular sua área.
 * Conteúdo praticados: double, multiplicação, variáveis descritivas.
 */
public class calculoAreaRetangulo {
    public static void executarCalculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        double altura = input.nextDouble();

        double areaRetangulo = base * altura;
        System.out.println("Area do retangulo: " + areaRetangulo);
    }
}
