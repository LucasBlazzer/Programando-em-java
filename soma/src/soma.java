import java.util.Scanner;


public class soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seja Bem-vindo a minha primeira aplicação Java");

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
                "\nSeu CPF: "+cpf+
                "\nSua idade é de: "+ idade+
                "\nSeu peso: "+peso+
                "\nSua altura: "+altura+
                "\nSeu estado civil: "+estadoCivil);
    }
}
