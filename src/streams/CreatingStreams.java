package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        //How to build Streams

        Consumer<String> print = System.out::print; //não preciso dar sout pra imprimir toda vez, apenas "print"
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); //método estático
        langs.forEach(print);

        String[] moreLangs = {"Python ", "Lisp ", "Pearl ", "Go\n"};

        Stream.of(moreLangs).forEach(print);
        Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 4).forEach(print); //pegar um subarray e transformar em stream

        List<String> otherLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        otherLangs.stream().forEach(print);
        otherLangs.parallelStream().forEach(print); //stream paralelo: dados não são processados na ordem

        //Stream.generate(() -> "a").forEach(print); //gerar stream potencialmente infinita, sem ordenção
        //Stream.iterate(0, n -> n + 1).forEach(println); //gerar stream potencialmente infinita, com ordenção

    }
}
