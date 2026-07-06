import com.objetos.entity.Carros;
import com.objetos.entity.Motos;

import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a opção que você quer cadastrar: \n" +
                "1 - Carros\n" +
                "2 - Motos\n");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                cadastrosCarros();
                break;
            case 2:
                cadastroMotos();
                break;
        }
    }

    public static void cadastroMotos() {
        Scanner input = new Scanner(System.in);

        int quantidade;

        do {
            System.out.println("Digite a quantidades de Motos que deseja cadastrar: Máximo 50 Motos por cadastros ");
            quantidade = input.nextInt();
            if (quantidade <= 1 || quantidade >= 50) {
                System.out.println("Quantidade inválida! Digite um valor entre 1 e 50.");
            }
        } while (quantidade < 1 || quantidade > 50);

        //Criando um objetos Motos.
        Motos[] moto = new Motos[quantidade];

        for (int i = 0; i < moto.length; i++) {
            System.out.println("\nCADASTRO DE MOTOS" + (i + 1));

            System.out.println("Digite a marca da moto:");
            String marca = input.next();

            System.out.println("Digite o modelo da moto: ");
            String modelo = input.next();

            System.out.println("Digite o ano da moto: ");
            int ano = input.nextInt();

            System.out.println("Digite o valor da moto: ");
            double preco = input.nextDouble();

            moto[i] = new Motos(marca, modelo, ano, preco);
        }
    }


    public static void cadastrosCarros() {
        Scanner input = new Scanner(System.in);

        int quantidade;

        // Laço de repetição verifica se o valor digitado esta de acordo com o que o sistema está solicitando.
        do {
            //recebe a quantidade de Carros para o cadastro no sistema.
            System.out.println("Quantos Carros deseja cadastrar? Máximo 50 Carros por cadastro: ");
            quantidade = input.nextInt();

            //verifica o valor digita pelo usuário.
            if (quantidade < 1 || quantidade > 50) {
                System.out.println("Quantidade inválida! Digite um valor entre 1 e 50.");
            }
        } while (quantidade < 1 || quantidade > 50);

        //Criando um vetor de Carros.
        Carros[] carros = new Carros[quantidade];

        //Laço de repetição onde irá receber os dados de cadastro dos modelos dos Carros dependo da quantidade digita pelo usuário.
        for (int i = 0; i < carros.length; i++) {
            System.out.println("\nCADASTROS DE CARROS: " + (i + 1));

            System.out.println("Digite o modelo do carro: ");
            String modelo = input.next();

            System.out.println("Digite a marca do carro: ");
            String marca = input.next();

            System.out.println("Digite o ano de fabricação do carro: ");
            int ano = input.nextInt();

            System.out.println("Digite o valor de venda do carro: ");
            double preco = input.nextDouble();

            //Recebe as informações digitadas pelos usuário e grava em uma ArrayList.
            carros[i] = new Carros(modelo, marca, ano, preco);
        }
        //Aqui o algoritmo fará o calculo da soma de todos os precos dos veiculos gravados no Array.
        double somaPrecos = 0;
        System.out.println("\nCARROS CADASTRADOS");

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Modelo do carro: " + carros[i].getModelo());
            System.out.println("Marca do carro: " + carros[i].getMarca());
            somaPrecos += carros[i].getPreco();
        }

        System.out.println("\nQuantidade de carros cadastrados: " + carros.length);
        System.out.println("Soma total dos valores dos carros cadastrados: R$" + somaPrecos);

        //fechar o Scanner.
        input.close();
    }
}
