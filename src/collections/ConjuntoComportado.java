package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>(); //para alterar o tipo de dado a ser armazenado, de forma não organizada
        SortedSet<String> listaAprovados = new TreeSet<>(); //garante a ordem dos elementos
        //listaAprovados.add(1.2); nem será gerado -> erro de compilação
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Pedro");
        listaAprovados.add("Luca");

        System.out.println(listaAprovados);
        System.out.println();

        for (String candidato: listaAprovados) {
            System.out.println(candidato);
        }

    }
}
