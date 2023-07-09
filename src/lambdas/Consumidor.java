package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Product> printName = p -> System.out.println(p.name);

        Product p1 = new Product("Caneta", 12.34, 0.09);
        printName.accept(p1);

        Product p2 = new Product("Laptop", 2987.99, 0.25);
        Product p3 = new Product("Notebook", 19.90, 0.03);
        Product p4 = new Product("Eraser", 7.80, 0.18);
        Product p5 = new Product("Pencil", 4.39, 0.19);


        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        products.forEach(printName);
        products.forEach(p -> System.out.println(p.price));
        products.forEach(System.out::println);

    }

}
