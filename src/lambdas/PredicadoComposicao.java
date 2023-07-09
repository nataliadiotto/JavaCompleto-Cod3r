package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        // Predicate<Integer> isEven = number -> number % 2 == 0 ? true : false; (my own)
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> hasThreeDigits = number -> number >= 100 && number <= 999;

        System.out.println(isEven.test(120));
        System.out.println(hasThreeDigits.test(120));

        System.out.println(isEven.and(hasThreeDigits).test(121));
        System.out.println(isEven.or(hasThreeDigits).test(121));

    }

}
