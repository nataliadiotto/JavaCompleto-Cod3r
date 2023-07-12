package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("BMW ", "Audi ", "Honda ");
        System.out.println("Original:");
        brands.forEach(print);
        System.out.println("\n");

        System.out.println("Upper Case Stream:");
        brands.stream().map(b -> b.toUpperCase()).forEach(print);

        UnaryOperator<String> upperCase = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        UnaryOperator<String> scream = n -> n + "!!!! ";

        System.out.println("\n\nUsing composition:");
        //System.out.println(upperCase.andThen(firstLetter).andThen(scream).apply("BMW"));

        brands.stream()
                .map(upperCase)
                .forEach(print);

        System.out.println("\n\nFirst letter:");
        brands.stream()
                .map(upperCase)
                .map(firstLetter)
                .forEach(print);
        System.out.println();
        brands.stream()
                .map(upperCase)
                .map(firstLetter)
                .map(scream)
                .forEach(print);

    }
}
