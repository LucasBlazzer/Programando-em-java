
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class novosExercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo aos estudos do módulo de vetores\n");
        System.out.println("Digite uma das seguintes opcoes abaixo:\n" +
                "1 - trabalhando com vetores\n" +
                "2 - Ordenação Crescente\n" +
                "3 - Ordenação Decrescente\n" +
                "4 - Prática de Vetores\n");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                trabalhandoComVetores();
                break;
            case 2:
                ordenacaoCrescente();
                break;
            case 3:
                ordenacaoDescrecente();
                break;
            case 4:
                praticasDeVetores();
                break;
        }
    }

    private static void praticasDeVetores() {
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            //menu;
            System.out.println("\n=============MENU====================\n" +
                    "1 - Vetores e ordenação\n" +
                    "2 - Alteração, multiplicação e potenciação\n" +
                    "3 - Digite um nome e irei inverter\n" +
                    "0 - sair\n");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o tamanho do vetor\n");
                    int n = input.nextInt();
                    int [] vetor = new int [n];

                    System.out.println("Preencha o vetor:");
                    for(int i = 0; i < vetor.length; i++){
                        System.out.println("Digite o "+ (i+1)+"° número: ");
                        vetor[i] = input.nextInt();
                    }
                    //Vetor Original
                    System.out.println(Arrays.toString(vetor));
                    //bubble sort
                    for(int i = 0; i < vetor.length -1; i++){
                        for(int j = 0; j < vetor.length -1 - i; j++){
                            if(vetor[j] > vetor[j + 1]){
                                int aux = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = aux;
                            }
                        }
                    }
                    //Vetor Ordenado.
                    System.out.println("\nVetor Ordenado:");
                    System.out.println(Arrays.toString(vetor));

                    System.out.println("\nDigite um nome");
                    String nome = input.next();

                    int quantidadeVogais = 0;
                    for(int i = 0; i < nome.length(); i++){
                        char letra = Character.toLowerCase(nome.charAt(i));

                        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                            quantidadeVogais++;
                        }
                    }
                    System.out.println("\nO nome " + nome + " possui " + quantidadeVogais + " vogal/vogais.");
                    break;
                case 2:
                    System.out.println("Digite o tamanho do vetor\n");
                    int vtnumeros = input.nextInt();
                    int [] numeros = new int [vtnumeros];

                    for(int i = 0; i < numeros.length; i++){
                        System.out.println("Digite um número\n");
                        numeros[i] = input.nextInt();
                    }
                    //lista original
                    System.out.println(Arrays.toString(numeros));

                    for(int i = 0; i < numeros.length; i++){
                        if(numeros[i] % 2 == 0){
                            numeros[i] *= 2;
                        }else{
                            numeros[i] = (int) Math.pow(numeros[i],2);
                        }
                    }
                    //nova lista.
                    System.out.println(Arrays.toString(numeros));
                    break;
                case 3:
                    System.out.println("Digite o seu nome\n");
                    String nome_2 = input.next();

                    char [] vetorNome = nome_2.toCharArray();
                    char [] vetorNomeInvertido = new  char[vetorNome.length];
                    int posicao = 0;
                    for(int i = vetorNome.length - 1; i >= 0; i--){
                        vetorNomeInvertido[posicao] = vetorNome[i];
                        posicao++;
                        System.out.println(vetorNomeInvertido[i]);
                    }
                    //lista o vetor.
                    System.out.println(Arrays.toString(vetorNome));
                    System.out.println(Arrays.toString(vetorNomeInvertido));
            }
        }while (opcao != 0);
    }

    private static void ordenacaoDescrecente() {
        //Faça uma algoritmo que faça a ordenação de uma lista de número e uma lista de String.
        Scanner input = new Scanner(System.in);
        int vtpalavras, vtNumeros;
        System.out.println("Digite o quantas palavras você quer digitar:\n");
        vtpalavras = input.nextInt();
        System.out.println("Digite quantos números você quer digitar:\n");
        vtNumeros = input.nextInt();
        String[] palavras = new String[vtpalavras];
        int[] numeros = new int[vtNumeros];
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = input.nextLine();
            input.nextLine();
        }
        System.out.println("Lista de palavras do vetor:\n");
        System.out.println(Arrays.toString(palavras));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        System.out.println("Lista de números do vetor:\n");
        System.out.println(Arrays.toString(numeros));

        //aqui iremos fazer o algoritmo que ordenação de forma crescente;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("Números ordenada:\n");
        System.out.println(Arrays.toString(numeros));

        //Aqui iremos fazer o algoritmo que ordena de forma de ordem alfabetica:
        for (int i = 0; i < palavras.length; i++) {
            for (int j = i + 1; j < palavras.length; j++) {
                if (palavras[j].compareTo(palavras[j + 1]) < 0) {
                    String aux = palavras[j];
                    palavras[j] = palavras[j + 1];
                    palavras[j + 1] = aux;
                }
            }
        }
        System.out.println("Palavra ordenada:\n");
        System.out.println(Arrays.toString(palavras));
    }

    private static void ordenacaoCrescente() {
        //Faça uma algoritmo que faça a ordenação de uma lista de número e uma lista de String.
        Scanner input = new Scanner(System.in);
        int vtpalavras, vtNumeros;
        System.out.println("Digite o quantas palavras você quer digitar:\n");
        vtpalavras = input.nextInt();
        System.out.println("Digite quantos números você quer digitar:\n");
        vtNumeros = input.nextInt();
        String[] palavras = new String[vtpalavras];
        int[] numeros = new int[vtNumeros];
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = input.nextLine();
            input.nextLine();
        }
        System.out.println("Lista de palavras do vetor:\n");
        System.out.println(Arrays.toString(palavras));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }
        System.out.println("Lista de números do vetor:\n");
        System.out.println(Arrays.toString(numeros));

        //aqui iremos fazer o algoritmo que ordenação de forma crescente;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("Números ordenada:\n");
        System.out.println(Arrays.toString(numeros));

        //Aqui iremos fazer o algoritmo que ordena de forma de ordem alfabetica:
        for (int i = 0; i < palavras.length; i++) {
            for (int j = i + 1; j < palavras.length; j++) {
                if (palavras[j].compareTo(palavras[j + 1]) > 0) {
                    String aux = palavras[j];
                    palavras[j] = palavras[j + 1];
                    palavras[j + 1] = aux;
                }
            }
        }
        System.out.println("Palavra ordenada:\n");
        System.out.println(Arrays.toString(palavras));
    }

    private static void trabalhandoComVetores() {
        Scanner input = new Scanner(System.in);
        //Aqui vamos aprender a trabalhar vetores;
        //Aqui você receberá a quantidade de notas para ver quem está aprovado ou não;

        int vtnotas = 0;

        System.out.println("Ola digite quantas notas você precisa digitar:\n");
        vtnotas = input.nextInt();
        double[] notas = new double[vtnotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a primeira nota:\n");
            double nota1 = input.nextDouble();
            System.out.println("Digite a segunda nota:\n");
            double nota2 = input.nextDouble();
            System.out.println("Digite a terceira nota:\n");
            double nota3 = input.nextDouble();


            //aqui vamos conseguir o valor da média do aluno;
            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 7) {
                System.out.println("Aprovado");
                notas[i] = media;
            } else if (media >= 6) {
                System.out.println("recuperação");
                notas[i] = media;
            } else {
                System.out.println("Reprovado");
                notas[i] = media;
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nAs média da turma:");
            System.out.println(notas[i]);
        }
        input.close();
    }
}
