
import javax.swing.*;
import java.util.Scanner;

public class novosExercicios {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ola bem-vindo ao meu programa Java!!");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolhas as seguintes opções para começar a trabalhar:\n" +
                "1 - Trabalhando com Vetores\n"));
        switch (opcao) {
            case 1:
                trabalhandoComVetores();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Erro ao tentar criar o programa!!");
                break;
        }
    }

    private static void trabalhandoComVetores() {
        JOptionPane.showMessageDialog(null, "Vetores com Vetores!!");
        int vetordousuario = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho do vetor:"));
        String[] palavras = new String[vetordousuario];
        for(int i = 0; i < palavras.length; i++){
            palavras[i] = JOptionPane.showInputDialog(null,"Digite uma palavra no vetor");
            JOptionPane.showMessageDialog(null,palavras[i]);
        }

    }
}
