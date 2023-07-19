package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (total, n) -> total + n;

        Integer total1 = nums.stream().reduce(sum).get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, sum);
        System.out.println(total2);

        //Result: Optional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}

