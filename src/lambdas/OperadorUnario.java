package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> plusTwo = number -> number + 2;
        UnaryOperator<Integer> timesTwo = number -> number * 2;
        UnaryOperator<Integer> quadratic = number -> number * number;

        System.out.println(plusTwo.andThen(timesTwo).andThen(quadratic).apply(0));

        int result1 = plusTwo
                .andThen(timesTwo)
                .andThen(quadratic)
                .apply(2);
        System.out.println(result1);

        int result2 = quadratic //operações realizadas de trás pra frente
                .compose(timesTwo)
                .compose(plusTwo)
                .apply(0);
        System.out.println(result2);

    }
}
