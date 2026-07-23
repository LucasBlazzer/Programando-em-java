package AlgoritmosInterativos.Classes;


import java.util.Scanner;

/**
 * 6 - Cálculo de desconto em produto
 * objetivo - Peça o nome do produto, preço e tipo de cliente.
 * menu: 1-Cliente comum, 2-clinete VIP, 3-funcionário
 *
 * regra: Cliente comum = sem desconto;
 * Cliente VIP = 10% de desconto;
 * Funcionário = 20% de desconto;
 *
 * fórmulas:
 * desconto = preço * percentual
 * valorFinal = preco - desconto
 */
public class DescontoProduto {
    public static void executarDesconto(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite qual o tipo de cliente: " +
                "1 - Cliente Comum\n" +
                "2 - Cliente VIP\n" +
                "3 - Funcionário");
        int tipoCliente = leitor.nextInt();

        System.out.println("Digite o valor da compra do cliente: ");
        double valorCompra = leitor.nextDouble();

        if(tipoCliente == 1){
            double valorFinal = valorCompra;
            System.out.println("Total a pagar: R$ " + valorFinal);
        } else if(tipoCliente == 2){
            double desconto = valorCompra * 0.1;
            double valorFinal = valorCompra - desconto;
            System.out.println("Total a pagar: R$ " + valorFinal);
        }else if(tipoCliente == 3){
            double desconto = valorCompra * 0.2;
            double valorFinal = valorCompra - desconto;
            System.out.println("Total a pagar: R$ " + valorFinal);
        }

    }
}
