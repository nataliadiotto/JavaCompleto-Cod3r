package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Traditional form:");
        for (String nome: approved) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01:");
        approved.forEach(nome -> System.out.println(nome + ".")); //passar expressão lambda como foreach

        System.out.println("\nMethod Reference:");
        approved.forEach(System.out::println); //passando uma referência (end. de memória) para a função

    }
}
