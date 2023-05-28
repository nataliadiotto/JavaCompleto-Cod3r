package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet(); //criar um conjunto

        conjunto.add(1.2); //vai converter o tipo primitivo double pra uma classe do tipo Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("Test"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //união entre os dois conjuntos, não mantém nenhuma ordem
        conjunto.retainAll(nums); //interseção entre dois conjuntos, retém apenas o que há em comum em ambos
        System.out.println(conjunto);

       conjunto.clear();
        System.out.println(conjunto);

    }
}
