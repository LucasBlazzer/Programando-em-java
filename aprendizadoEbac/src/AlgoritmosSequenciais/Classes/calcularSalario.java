package AlgoritmosSequenciais.Classes;

import java.util.Scanner;

/**
 * 5 - Cálculo de Salário Mensal.
 * Objetivo: Criar um programa que calcule o salário mensal de um funcionário.
 */
public class calcularSalario {
    public static void executarSalario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();

        System.out.println("Digite o valor que esse funcionário ganhar por hora: ");
        double valorPorHora = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a quantidade de hora que esse funcionário trabalhou no mês: ");
        double horasTrabalhadas = sc.nextDouble();
        sc.nextLine();

        double salario = valorPorHora * horasTrabalhadas;

        System.out.println("\n=====FOLHA DE PAGAMENTO=====");
        System.out.println("Nome do Funcionário: " + nomeFuncionario);
        System.out.println("Valor da Hora: " + valorPorHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salario: " + salario);
        System.out.println("==============================");
    }
}
