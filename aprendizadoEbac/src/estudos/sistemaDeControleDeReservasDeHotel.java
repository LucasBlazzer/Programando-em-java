package estudos;

import com.objetos.entity.hotel.Reserva;

import java.util.Scanner;

public class sistemaDeControleDeReservasDeHotel {

    private static final int CAPACIDADE_MAXIMA = 10;

    private static Reserva[] reservas = new Reserva[CAPACIDADE_MAXIMA];
    private static int quantidadeReservas = 0;
    private static Scanner input = new Scanner(System.in);

    public static void executar() {
        //Dentro dessa classe será executado o principal do projeto. Nessa primeira chamada estarei chamando o menu do sistema de reserva de hotel.
        int opcao;

        //O laço de repetição do-while foi ideal aqui para fazer um menu que sempre voltará a ele se não for digitado a opção de saída.
        do {

            exibirMenu();// Essa classe chama um menu de opções que será exibida para o usuário poder selecionar a opção correta para o uso do sistema.

            opcao = lerInteiro("Escolha uma opção: ");// aqui estou chamando uma nova classe onde receberá a opção digitada pelo usuário.

            // O switch-case é um menu onde será chamada cada classe dependo da opção digitada pelo usuário.
            switch (opcao) {
                case 1:
                    cadastrarReserva();
                    break;

                case 2:
                    listarReservas();
                    break;

                case 3:
                    buscarReservasPorNome();
                    break;

                case 4:
                    ordenarReservasPorDias();
                    break;

                case 5:
                    System.out.println("Sistema de reservas encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 5);
    }

    private static void cadastrarReserva() {

        //Esse if verifica se ainda à vaga para fazer as reservas
        if (quantidadeReservas >= reservas.length) {
            System.out.println("Limite máximo de reservas atingido.");
            return;
        }

        //Apartir daqui começa o cadastro do hóspede no sistema do hotel.
        System.out.println("\n===== NOVA RESERVA =====");

        System.out.print("Digite o nome do hóspede: ");
        String nome = input.nextLine();

        String tipoQuarto = escolherTipoQuarto();

        int numeroDias = lerInteiroMinimo("Digite o número de dias da estadia: ", 1);

        double valorDiaria = lerDoublePositivo("Digite o valor da diária: ");

        try {
            Reserva reserva = new Reserva(nome, tipoQuarto, numeroDias, valorDiaria);

            reservas[quantidadeReservas] = reserva;
            quantidadeReservas++;

            System.out.println("Reserva adicionada com sucesso!");

        } catch (IllegalArgumentException erro) {
            System.out.println("Erro ao cadastrar reserva: " + erro.getMessage());
        }
    }

    private static String escolherTipoQuarto() {

        // Nessa classe o usuário poderá fazer a escolha do tipo de suite que vai fazer a estadia.
        while (true) {
            System.out.println("\nEscolha uma das opções de quarto abaixo:");
            System.out.println("1 - Suíte Básica");
            System.out.println("2 - Suíte Master");
            System.out.println("3 - Suíte Presidencial");

            int opcaoQuarto = lerInteiro("Digite a opção do quarto: ");

            switch (opcaoQuarto) {
                case 1:
                    return "Suíte Básica";

                case 2:
                    return "Suíte Master";

                case 3:
                    return "Suíte Presidencial";

                default:
                    System.out.println("Opção de quarto inválida! Tente novamente.");
                    break;
            }
        }
    }

    private static void listarReservas() {

        //Lista a todos os hospedes cadastrados no sistema do hotel.

        if (quantidadeReservas == 0) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }

        System.out.println("\n===== LISTA DE RESERVAS =====");

        for (int i = 0; i < quantidadeReservas; i++) {
            System.out.println("\nRESERVA " + (i + 1) + ":");
            System.out.println(reservas[i]);
        }

        System.out.println("\nQuantidade total de reservas: " + quantidadeReservas);
    }

    private static void buscarReservasPorNome() {

        //Busca o nome do hospede independente se o usuário digitou o nome com letra maiuscula ou minuscula.
        if (quantidadeReservas == 0) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }

        System.out.print("Digite parte do nome do hóspede: ");
        String nomeBusca = input.nextLine().toLowerCase();

        boolean encontrouHospede = false;

        System.out.println("\n===== RESULTADO DA BUSCA =====");

        for (int i = 0; i < quantidadeReservas; i++) {
            String nomeHospede = reservas[i].getNomeDoHospede().toLowerCase();

            if (nomeHospede.contains(nomeBusca)) {
                System.out.println("\nReserva encontrada:");
                System.out.println(reservas[i]);
                encontrouHospede = true;
            }
        }

        if (!encontrouHospede) {
            System.out.println("Nenhuma reserva encontrada com esse nome.");
        }
    }

    private static void ordenarReservasPorDias() {

        //Ordena a lista de hospede pela quantidade de dias deixando os que irão ficar mais dias hospedados na frente daqueles que ficarão menos dias.

        if (quantidadeReservas == 0) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }

        for (int i = 0; i < quantidadeReservas - 1; i++) {
            for (int j = 0; j < quantidadeReservas - 1 - i; j++) {

                if (reservas[j].getDiasEstadia() < reservas[j + 1].getDiasEstadia()) {
                    Reserva reservaTemporaria = reservas[j];
                    reservas[j] = reservas[j + 1];
                    reservas[j + 1] = reservaTemporaria;
                }
            }
        }

        System.out.println("Reservas ordenadas com sucesso!");
        listarReservas();
    }

    private static int lerInteiro(String mensagem) {

       // Nessa classse o algoritmo verifica se o número digitado é valido.

        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(input.nextLine());

            } catch (NumberFormatException erro) {
                System.out.println("Valor inválido! Digite um número inteiro válido.");
            }
        }
    }

    private static int lerInteiroMinimo(String mensagem, int minimo) {

       // Nessa classe o algoritmo verifica se o número digita é maior que o mínimo de dias validos para a estadia.

        while (true) {
            int numero = lerInteiro(mensagem);

            if (numero >= minimo) {
                return numero;
            }

            System.out.println("Valor inválido! O número precisa ser no mínimo " + minimo + ".");
        }
    }

    private static double lerDoublePositivo(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(input.nextLine().replace(",", "."));

                if (valor > 0) {
                    return valor;
                }

                System.out.println("Valor inválido! O valor precisa ser maior que zero.");

            } catch (NumberFormatException erro) {
                System.out.println("Valor inválido! Digite um valor válido.");
            }
        }
    }

    private static void exibirMenu() {

        //Exibe o menu para o usuário com as opções para que ele possa fazer as escolhas.

        System.out.println("\n===== SISTEMA DE RESERVAS DE HOTEL =====");
        System.out.println("1 - Nova Reserva");
        System.out.println("2 - Listar Reservas");
        System.out.println("3 - Buscar Reservas por nome do hóspede");
        System.out.println("4 - Ordenar reservas por número de dias");
        System.out.println("5 - Sair");
        System.out.println("========================================");
    }
}