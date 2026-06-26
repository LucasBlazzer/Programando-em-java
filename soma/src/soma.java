import javax.swing.*;
import java.util.Scanner;


public class soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seja Bem-vindo a minha primeira aplicação Java\n");

        System.out.println("Digite a opção desejada:\n" +
                "1 - Cadastro de usuário\n" +
                "2 - Comparação entre dois números\n" +
                "3 - Soma de Variáveis\n" +
                "4 - Subtração de Variáveis\n" +
                "5 - Calculo de IMC\n" +
                "6 - Números Crescentes e Descrescentes");
        int opcao = input.nextInt();
        switch (opcao){
            case 1:
                Cadastro();
                break;
            case 2:
                comparando();
                break;
            case 3:
                somaDeVariaveis();
                break;
            case 4:
                subtracaoDeVariaveis();
                break;
            case 5:
                calculoImc();
                break;
            case 6:
                crescentesDescrescentes();
                break;
        }
        input.close();
    }

    private static void crescentesDescrescentes() {
        System.out.println("Seja Bem-Vindo a aplicação Java de Contagem Crescente e Descrescentes");
        Scanner input = new Scanner(System.in);

        //Recebe o nome do usuário.
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        //Recebe o número positivo para fazer a contagem crescente.
        System.out.println("Digite um número positivo:");
        int crescente = input.nextInt();

        //verifica se o número é positivo ou não.
        while (crescente < 0){
            System.out.println("Número inválido, por favor digite novamente um número positivo.\n");
            crescente = input.nextInt();
        }

        //começa a contagem crescente.
        System.out.println("Sua Contagem crescente:\n");
        for (int i = 0; i <= crescente; i++){
            System.out.println(i);
        }

        //Começa aqui a contagem decrescente.
        System.out.println("Sua Contagem Decrescente:\n");
        for (int i = crescente; i >= 0; i-- ){
            System.out.println(i);
        }

        //faz a verificação de quantas letras tem o nome digitado e faz a exibição.
        if (nome.length() > 6){
            for (int i = 0; i <= nome.length(); i++){
                System.out.println(nome.toUpperCase());
            }
        }else{
            System.out.println(nome);
        }

        input.close();
    }

    private static void calculoImc() {
    }

    private static void subtracaoDeVariaveis() {
        Scanner input = new Scanner (System.in);

    }

    public static void Cadastro() {
        Scanner input = new Scanner(System.in);

        //Usuário digitará o nome dele.
        System.out.println("Digite seu nome completo:\n");
        String nomeCompleto = input.nextLine();


        //Usuário digitará o CPF.
        System.out.println("Digite seu CPF (somente os números):\n");
        String cpf = input.nextLine();

        //Usuário digitará a idade dele.
        System.out.println("Digite a sua idade (somente números):\n");
        int idade = input.nextInt();

        //Usuário digitará o seu peso - variável Double ou float.
        System.out.println("Digite o seu peso\n");
        double peso = input.nextDouble();

        //Usuário digitará sua altura - variável double ou float
        System.out.println("Digite a sua altura\n");
        double altura = input.nextDouble();

        //Usuário digitará seu estado civil - String
        System.out.println("Digite seu estado civil: \n");
        String estadoCivil = input.nextLine();

        //Impressão das informações na tela.
        System.out.println("Seu nome é: " + nomeCompleto +
                "\nSeu CPF: " + cpf +
                "\nSua idade é de: " + idade +
                "\nSeu peso: " + peso +
                "\nSua altura: " + altura +
                "\nSeu estado civil: " + estadoCivil);

        input.close();//fechamento do metodo scanner.
    }

    public static void comparando() {
        Scanner input = new Scanner(System.in);

        //Apartir desse trecho do código estarei fazendo a implementação dos códigos condicionais
        System.out.println("digite um número: \n");
        int numero = input.nextInt();

        System.out.println("Digite o segundo número: \n");
        int numero2 = input.nextInt();

        //código condicional para comparar se os números digitados.
        if (numero > numero2) {
            System.out.println("O maior é: " + numero);
        } else if (numero2 > numero) {
            System.out.println("O maior é: " + numero2);
        } else {
            System.out.println("Os número são iguais");
        }
        input.close();
    }

    public static void somaDeVariaveis() {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: \n");
        int numero = input.nextInt();

        System.out.println("Digite o segundo número: \n");
        int numero2 = input.nextInt();

        int soma  =  numero + numero2;
        System.out.println("A soma de: " + numero + " + " + numero2 + " = " + soma);

        input.close();
    }
}
