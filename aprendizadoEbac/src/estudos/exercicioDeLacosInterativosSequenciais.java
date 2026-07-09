package estudos;

import java.util.Scanner;

public class exercicioDeLacosInterativosSequenciais {

    public static void executar(){
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\nBem-vindo ao módulo de exercício de algoritmos sequenciais, interativos e lacos de repetição!\n" +
                    "Digite a opção que deseja executar:\n" +
                    "1 - Cadastros de usuários\n" +
                    "2 - Comparação entre dois números\n" +
                    "3 - Soma de Variáveis\n" +
                    "4 - Subtração de Variáveis\n" +
                    "5 - CAlculos de IMC\n" +
                    "6 - Números Crescentes e Descrescentes\n" +
                    "7 - Saque de Banco\n" +
                    "8 - Verificando Senha\n" +
                    "9 - Calculo de Potência\n" +
                    "10 - Tabuada e Menu Interativo" +
                    "0 - Sair");

            opcao = input.nextInt();
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
                case 7:
                    saque();
                    break;
                case 8:
                    verificandoSenhas();
                    break;
                case 9:
                    potencia();
                    break;
                case 10:
                    tabuada();
                    break;
            }
        }while(opcao != 0);
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
        System.out.println("A estudos.soma de: " + numero + " + " + numero2 + " = " + soma);

        input.close();
    }

    private static void subtracaoDeVariaveis() {
        //Esse algoritmo deve calcular uma subtração entre duas variáveis.
        Scanner input = new Scanner (System.in);
        System.out.println("Bem-vindo ao algortimo de subtração!\n");

        System.out.println("Digite a primeira variável.\n");
        int num_1 = input.nextInt();

        System.out.println("Digite a segunda variável.\n");
        int num_2 = input.nextInt();

        int resultado = num_1 - num_2;
        System.out.println("O resultado da subtração de: "+num_1+" - "+num_2+" = "+resultado);

        input.close();
    }

    private static void calculoImc() {
        //Aqui vamos fazer um algoritmo para fazer um calculo de IMC.
        Scanner input = new Scanner (System.in);
        System.out.println("Bem-vindo ao algortimo de calculo de IMC!\n");

        //Solicitação de dados para o usuário.
        System.out.println("Digite a sua altura.\n");
        double altura = input.nextDouble();

        System.out.println("Digite seu peso.\n");
        double peso = input.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso, procure um nutricionista!\n");
        }else if (imc >18.5 && imc < 24.9){
            System.out.println("Peso Normal! Mantenha assim!\n");
        }else if (imc >24.9 && imc < 29.9){
            System.out.println("Você esta com Sobrepeso, procure um nutricionista!\n");
        }else if (imc >29.9 && imc < 32.9){
            System.out.println("Obesidade Grau I, procure um nutricionista!\n");
        } else if (imc >32.9 && imc < 39.9) {
            System.out.println("Obesidade Grau II (Severa), procure um nutricionista!\n");
        }else if (imc >39.9 && imc < 41.9){
            System.out.println("Obesidade Grau III (Mórbida), procure um nutricionista ou médico especialista!\n");
        }

        input.close();
    }

    private static void tabuada() {
        Scanner input = new Scanner(System.in);

        int num, contador = 0, opcao;

        System.out.println("Bem-vindo usuário ao meu programa!\n");

        System.out.println("Digite um número para que possamos fazer nossa tabuada:\n");
        num = input.nextInt();
        //tabuada
        while (contador <= 10) {
            int resultado = num * contador;
            System.out.println(num + " X " + contador + " = " + resultado);
            contador++;
        }
        //frase digitada pelo usuário usando um menu.
        do{
            System.out.println("\nVocê gostou do meu programa!\n");
            System.out.println("1 - continuar\n");
            System.out.println("2 - sair\n");
            System.out.println("Escolha uma das opções:\n");

            opcao = input.nextInt();
            input.nextLine();

            if(opcao == 1){
                System.out.println("Digite uma frase:\n");
                String frase = input.nextLine();
                System.out.println("Você digitou:" + frase);
            }else if(opcao == 2){
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.\n");
            }else{
                System.out.println("opção inválida!!");
            }
        }while(opcao!=2);
        input.close();
    }

    private static void potencia() {
        //faça um algoritmo que faça o calculo de potenciação entre dois números;

        Scanner input = new Scanner(System.in);
        int base, expoente, resultado = 1;
        System.out.println("Digite o valor da base\n");
        base = input.nextInt();

        System.out.println("Digite o valor da expoente\n");
        expoente = input.nextInt();

        do {
            resultado = base * resultado;
            expoente--;

        }while(expoente > 0);
        System.out.println(resultado);
        input.close();
    }

    private static void verificandoSenhas() {
        //Faça um algortimo que faça um algoritmo que faça verifique a senha do sistema com a senha digitada pelo usuário.
        Scanner input = new Scanner (System.in);

        //variáveis:
        String senhaDoSistema = "Java54321";
        String senhaDigitada;
        int tentativas = 3;

        while (tentativas > 0){
            System.out.println("Digite seu senha para verificando senha:\n");
            senhaDigitada = input.next();

            if (senhaDigitada.equals(senhaDoSistema)){
                System.out.println("Senha correta!");
                break;
            }else {
                System.out.println("Senha incorreta!");
                tentativas--;
            }
        }

        if (tentativas == 0){
            System.out.println("Conta Bloqueada!");
        }
        input.close();
    }

    private static void saque() {
        //crie um algoritmo que simule um saque de cedulas. As cedulas disponiveis para saque são as seguintes:
        // R$100,00 - R$50,00 - R$20,00 - R$10,00 - R$5,00 - R$2,00
        Scanner input = new Scanner (System.in);

        int valorSaque = 0;
        System.out.println("Digite o valor que deseja sacar: \n");
        valorSaque = input.nextInt();
        if (valorSaque < 2 || valorSaque > 1000){
            System.out.println("Saque inválido. O valor deve estar entre R$2,00 e R$1000,00\n");
        }else if(valorSaque == 3){
            System.out.println("Saque inválido. Não é possível sacar R$3,00 com as notas disponiveis!\n");
        }else{
            int nota100 = 0;
            int nota50 = 0;
            int nota20 = 0;
            int nota10 = 0;
            int nota5 = 0;
            int nota2 = 0;

            int restante = valorSaque;
            while (restante >= 100 && restante - 100!= 1 && restante - 100 != 3){
                nota100++;
                restante -= 100;
            }
            while (restante >= 50 && restante - 50!= 1 && restante - 50 != 3){
                nota50++;
                restante -= 50;
            }
            while(restante >= 20 && restante - 20!= 1 && restante - 20 != 3){
                nota20++;
                restante -= 20;
            }
            while(restante >= 10 && restante - 10!= 1 && restante - 10 != 3){
                nota10++;
                restante -= 10;
            }
            while(restante >= 5 && restante - 5!= 1 && restante - 5 != 3){
                nota5++;
                restante -= 5;
            }
            while (restante >= 2 ){
                nota2++;
                restante -= 2;
            }

            System.out.println("\nSaque realizado com sucesso\n");
            System.out.println("Valor sacado: R$ "+valorSaque);

            System.out.println("\nNotas entregues:");

            if(nota100 > 0){
                System.out.println(nota100 + " nota(s) de R$100,00");
            }

            if (nota50 > 0){
                System.out.println(nota50 + " nota(s) de R$50,00");
            }

            if (nota20 > 0){
                System.out.println(nota20 + " nota(s) de R$20,00");
            }

            if (nota10 > 0){
                System.out.println(nota10 + " nota(s) de R$10,00");
            }

            if (nota5 > 0){
                System.out.println(nota5 + " nota(s) de R$5,00");
            }

            if (nota2 > 0){
                System.out.println(nota2 + " nota(s) de R$2,00");
            }
            input.close();
        }


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
}
