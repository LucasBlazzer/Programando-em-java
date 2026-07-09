package estudos;

import java.math.BigInteger;
import java.util.Scanner;

public class recursividadeProgramacaoDinamica {
    public static void exercutar() {
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\nBEM-VINDO AO PROGRAMA DE APRENDIZAGEM SOBRE RECURSIVIDADE E PROGRAMAÇÃO DINÂMICA.\n" +
                    "Digite uma das opções abaixo:\n" +
                    "1 - Sequência de Fibonacci\n" +
                    "2 - Fatorial\n" +
                    "3 - Exercício Na Prática\n" +
                    "0 - Sair");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    sequenciaFibonacci();
                    break;
                case 2:
                    fatoriais();
                    break;
                case 3:
                    naPratica();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    throw new IllegalArgumentException("Opção invalida.");
            }
        }while(opcao != 0);
    }

    private static void naPratica() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n EXERCÍCIO NA PRÁTICA EBAC\n" +
                "Digite a quantidade de degraus: ");
        int numeroDeDegraus = input.nextInt();

        if (numeroDeDegraus < 1){
            System.out.println("A quantidade de degraus precisa ser maior que zero.");
            return;
        }

        int resultado = recursividadeProgramacaoDinamica.calcularFormasDeSubir(numeroDeDegraus);

        System.out.println("Quantidade de maneiras distintas de subir " + numeroDeDegraus + " degraus: " + resultado);
    }

    public static int calcularFormasDeSubir(int numeroDeDegraus) {
        if (numeroDeDegraus == 1){
            return 1;
        }

        if (numeroDeDegraus == 2){
            return 2;
        }
        return calcularFormasDeSubir(numeroDeDegraus - 1) + calcularFormasDeSubir(numeroDeDegraus - 2);
    }

    private static void fatoriais() {

        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número para fazer o fatorial dele: ");
        numero = input.nextInt();

        int fatorialInt = 1;
        long fatorialLong = 1;

        //sem recursividade.
        if(numero <= 12){
            for(int i = 1; i <= numero; i++){
                fatorialInt *= i;
                System.out.println(fatorialInt);
            }
            System.out.println("O fatorial de: " + numero + " é de: " + fatorialInt);
        }else if(numero < 12 || numero <= 20){
            for(int i = 1; i <= numero; i++){
                fatorialLong *= i;
                System.out.println(fatorialLong);
            }
            System.out.println("O fatorial de: " + numero + " é de: " + fatorialLong);
        }else if(numero > 20){
            BigInteger fatorial = BigInteger.ONE;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("O fatorial de: " + numero + " = " + fatorial);
        }

    }

    private static BigInteger calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;
        if(numero == 0 || numero == 1){
            return fatorial;
        }else{
            return fatorial.multiply(BigInteger.valueOf(numero-1));
        }
    }

    private static void sequenciaFibonacci() {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){

            //sem recursividade
            System.out.println("(" + i + "):" + recursividadeProgramacaoDinamica.fibonacci(i) + "\t");

            //com recursividade
            System.out.println("(" + i + "):" + recursividadeProgramacaoDinamica.fibonacci_2(i) + "\t");
        }
    }

    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        }  else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static long fibonacci_2(int n) {
        return (n < 2) ?n : (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
