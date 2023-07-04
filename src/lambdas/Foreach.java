package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Traditional form:");
        for (String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01:");
        approved.forEach(name -> System.out.println(name + ".")); //passar expressão lambda como foreach

        System.out.println("\nMethod Reference:");
        approved.forEach(System.out::println); //passando uma referência (end. de memória) para a função

        System.out.println("\nLambda #02:");
        approved.forEach(name -> myPrint(name + "."));

        System.out.println("\nPersonalized Method Reference:");
        approved.forEach(Foreach::myPrint);

    }

    static void myPrint(String name) {
        System.out.println("Hi! My name is " + name);
    }
}
