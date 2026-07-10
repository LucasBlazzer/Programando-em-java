package estudos;
import com.objetos.entity.PilhaListaFila.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class tecnicasConceitosAvancados {
    public static void executar() {
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("Digite a opção desejada:\n " +
                    "1 - Exemplo: Busca Binária\n" +
                    "2 - Lista de Nomes\n" +
                    "3 - Lista de Produtos\n");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    buscaBinaria();
                    break;
                case 2:
                    listarDeNomes();
                    break;
                case 3:
                    listaDeProdutos();
                    break;
            }
        }while(opcao != 0);
    }

    private static void listaDeProdutos() {
        ArrayList<Produtos> produtos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Ola bem-vindo a algoritmo de cadastro de produtos.\n" +
                    "Por favor, digite uma das opções abaixo:\n" +
                    "1 - Cadastrar produtos\n" +
                    "2 - Listar produtos\n" +
                    "3 - Buscar produtos por nome\n" +
                    "4 - Calcular valor total em estoque\n" +
                    "5 - Remover produtos do estoque\n" +
                    "6 - sair");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Bem-vindo ao cadastro de produtos:\n" +
                            "Por favor, digite o nome do produto: ");
                    String nome = input.next();

                    System.out.println("Digite o preço do produto: ");
                    double preco = input.nextDouble();

                    System.out.println("Digite a quantidade do produto que entrará no estoque: ");
                    int quantidade = input.nextInt();

                    produtos.add(new Produtos(nome, preco, quantidade));
                    break;
                case 2:
                    for(int i = 0; i < produtos.size(); i++) {
                        System.out.println("\nPRODUTOS\n");
                        System.out.println("|" + produtos.get(i).getNome() + "|");
                    }
                    break;
            }
        }while(opcao != 6);

    }

    private static void listarDeNomes() {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá bem-vindo ao exercícios de fixação de lista. Aqui vamos fazer um algoritmo que cadastra uma série de nomes.\n" +
                "Por favor escolha uma das opções abaixo para o algoritmo funcionar:\n" +
                "1 - Adicionar nome\n" +
                "2 - Listar nomes\n" +
                "3 - Buscar nome\n" +
                "4 - remover nome\n" +
                "5 - sair");

        int opcao  = input.nextInt();
        ArrayList<String> nomes = new ArrayList<>();

        switch(opcao){
            case 1:
                System.out.println("Digite um nome: ");
                String nome = input.nextLine();
                if(nome == null){
                    System.out.println("O valor está vazio! Por favor digite um nome. ");
                    nome = input.nextLine();
                }else {
                    nomes.add(nome);
                }
                break;
            case 2:
                if (nomes.isEmpty()){
                    System.out.println("Sua lista está vazia!");
                }else{
                    for(int i = 0; i < nomes.size(); i++){
                        System.out.println(nomes.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("Digite o valor que deseja buscar: ");
                String nomeBusca = input.nextLine();
                if(nomeBusca.isEmpty()){
                    System.out.println("Nome não encontrado!");
                }else {
                    for (int  i = 0; i < nomes.size(); i++){
                        if(nomes.get(i).equals(nomeBusca)){
                            System.out.println(nomes.get(i));
                            System.out.println("O nome da busca foi encontrado!");
                        }
                    }
                }
                break;
            case 4:
                System.out.println("Digite o valor que deseja remover: ");
                String nomeRemover = input.nextLine();
                if(nomeRemover.isEmpty()){
                    System.out.println("O nome digitado não foi encontrado!");
                }else {
                    nomes.remove(nomeRemover);
                    System.out.println("Nome removido com sucesso!");
                }

        }
    }

    private static void buscaBinaria() {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int alvo = 7;
        int resultado = calculoBuscaBinaria(array, alvo);
        if(resultado == -1){
            System.out.println("O resultado não está na lista.");
        }else{
            System.out.println("O valor foi encontrado. " + resultado);
        }
    }

    private static int calculoBuscaBinaria(int[] array, int alvo) {
        int esquerda = 0;
        int direito = array.length - 1;

        while(esquerda <= direito){
            int meio = (esquerda + direito) / 2;

            if(array[meio] == alvo){
                return meio;
            }
            if(array[meio] < alvo){
                esquerda = meio + 1;
            }else {
                direito = meio - 1;
            }
        }
        return -1;
    }
}
