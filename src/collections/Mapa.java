package collections;

import java.util.HashMap;
import java.util.Map;


public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); //put -> add ou substitui se já existir dados naquela chave
        usuarios.put(2, "Larissa");
        usuarios.put(1, "Pedro");
        usuarios.put(3, "Manu");
        usuarios.put(4, "Rafaela");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println();
        System.out.println(usuarios.values());
        System.out.println();
        System.out.println(usuarios.entrySet());
        System.out.println();

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Pedro"));
        System.out.println();

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));//remover pela chave
        System.out.println(usuarios.remove(4, "Gui")); //False pq não existe esse valor no indicio 4
        System.out.println();

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        System.out.println();

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }
        System.out.println();

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "- ");
            System.out.println(registro.getValue());
        }

    }
}
