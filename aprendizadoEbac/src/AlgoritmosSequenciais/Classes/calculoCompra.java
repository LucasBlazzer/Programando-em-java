package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 8 - Cálculo de valor total de uma compra.
 * Objetivo: Criar um programa que calcule o valor total de uma compra.
 */
public class calculoCompra {
    public static void executarCalculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo do produto: ");
        String tipoProduto = input.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        input.nextLine();

        System.out.println("Digite o quantidade de produto: ");
        int quantidadeProduto = input.nextInt();
        input.nextLine();

        double valorTotal = valorProduto * quantidadeProduto;

        System.out.println("\n=====O VALOR TOTAL A PAGAR=====");
        System.out.println("Tipo do produto: " + tipoProduto);
        System.out.println("Quantidade de produto: " + quantidadeProduto);
        System.out.println("Valor por unidade do produto: " + valorProduto);
        System.out.println("Total a pagar: " + valorTotal);
        System.out.println("================================");
    }
}
