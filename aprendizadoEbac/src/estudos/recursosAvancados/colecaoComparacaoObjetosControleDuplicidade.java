package estudos.recursosAvancados;

import com.objetos.entity.colecaoComparacaoObjetosControleDuplicidade.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class colecaoComparacaoObjetosControleDuplicidade {

    public static void executar(){
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Lucas", 30));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("Pedro", 35));
        pessoas.add(new Pessoa("Pâmela", 35));
        pessoas.add(new Pessoa("Pedro", 35));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Pedro", 36));


        System.out.println("Quantidade final de pessoas no conjuntos: " + pessoas.size());

        System.out.println("\nPessoas cadastradas: ");

        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa);
        }

        /*
        * Explicação sobre o código:
        * O HashSet não permite elementos duplicados.
        * Como os métodos equals() e hashCode() foram implementados na classe Pessoa.
        * Duas pessoas com o mesmo nome e a mesma idade são consideradas iguais.
        * Por isso, Pedro com 35 anos não foi cadastrado. Já Pedro com 36 foi mantido, por que apesar do nome
        * ser igual, a idade é diferente.
        **/
    }
}
