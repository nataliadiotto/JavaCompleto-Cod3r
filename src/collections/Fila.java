package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> add elementos na fila
        //Diferença: quando a fila está cheia. Offer: retorna falso. Add: joga uma exceção.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obter o próximo elemento da fila sem remover.
        //Diferença peek e element: quando a fila está vazia. Peek: retorna null. Element: joga uma exceção.
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println();

        System.out.println(fila.poll()); //retorna null quando a fila estiver vazia
        System.out.println(fila.remove()); //lança uma exceção quando a fila estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

//       fila.size();
//       fila.clear();
//       fila.isEmpty();
//       fila.contains(...);

    }
}
