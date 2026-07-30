package AlgoritmosInterativos.Classes;

import java.util.Scanner;

/**
 * 8 - Simulador de Caixa Eletrônico
 * Objetivo: Peça o saldo atual e o valor do saque.
 * Regras: Se o saque for menor ou igual ao saldo -> saque permitido;
 *           Se o saque for maior que o saldo -> saldo insuficiente;
 *           Se o saque for menor ou igual a zero ->: valor inválido;
 * Exemplo: saldo atual : 1000,00
 * valor do saque: 300
 *
 * saque realizado com sucesso.
 * saldo restante: 700
 *
 */
public class CaixaEletronico {
    public static void executarCaixaEletronico() {
        Scanner leitor = new Scanner(System.in);;

        double saldoConta = 1000.00;

        //Recebe o valor de saque do usuário;
        System.out.println("Digite o valor que deseja sacar: ");
        double saque = leitor.nextDouble();

        //Faz a verificação do saldo que tem disponível na conta conferindo se tem ou não saldo disponível.
        if(saque > saldoConta){
            System.out.println("Saldo insuficiente!");
        } else if (saque <= saldoConta && saque > 0){
            double novoSaldo = saldoConta - saque;
            System.out.println("Saque permitido!");
            System.out.println("Seu novo saldo é de: R$" + novoSaldo);
        }else if(saque <= 0){
            System.out.println("Valor informado é inválido!");
        }
    }
}
