package AlgoritmosLacosRepeticao.Classes;

/**
 * 5 - Mostrar os pares
 * crie um programa que mostre os números pares que estão no intervalo de 1 a 50.
 * dica: use = num % 2 == 0.
 */
public class MostrarPares {
    public static void executarMostrarPares(){
        System.out.println("Esse algoritmo irá mostrar os números pares que estão em um intervalo de 1 a 50.");

        //Aqui será feito um laço de repetição que irá de 1 a 50 para fazer a verificação.
        for (int i = 0; i <= 50 ; i++){
            //Aqui faz a verificação vendo qual é par e qual é impar.
            if(i % 2 == 0){
                System.out.println(i + " é par!");
            } else{
                System.out.println(i + " é impar");
            }
        }
    }
}
