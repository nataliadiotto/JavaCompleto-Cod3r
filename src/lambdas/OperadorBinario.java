package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> average = (num1, num2) -> (num1 + num2) / 2;
        System.out.println(average.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result =
                (num1, num2) -> ((num1 + num2) / 2) >= 7 ? "Pass!" : "Retake the tests";
        System.out.println(result.apply(5.5, 8.0));

        Function<Double, String> concept = avrg -> avrg >= 7 ? "Pass!" : "Retake the tests";

        System.out.println(average.andThen(concept).apply(10.0, 8.5)); //usando composicao de funcoes

    }
}
