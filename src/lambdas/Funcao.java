package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd.apply(33));
        System.out.println(evenOrOdd.apply(22));

        Function<String, String> theResultIs = value -> "The result is: " + value;

        Function<String, String> emphasis = value -> value + "!!!";

        Function<String, String> doubt = value -> value + "???";

        String finalResult = evenOrOdd
                .andThen(theResultIs)
                .andThen(emphasis)
                .apply(32);

        String finalResult2 = evenOrOdd
                .andThen(theResultIs)
                .andThen(doubt)
                .apply(33);

        System.out.println();
        System.out.println(finalResult);
        System.out.println(finalResult2);

    }

}
