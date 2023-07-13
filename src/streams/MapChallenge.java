package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallenge {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        nums.forEach(System.out::print);
        System.out.println("\n");

        UnaryOperator<String> invert = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> convertBack = c -> Integer.parseInt(c, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(invert)
                .map(convertBack)
                .forEach(System.out::println);

        /*
        TRES MAPS
        1. Número para string binária... 6 => "110" (usando mapeamento) OK
        2. Inverter a string "110" => "011"
        3. Converter de volta para inteiro => "011" => 3
        Integer. (tem alguns comportamentos que podem auxiliar)
         */
    }
}
