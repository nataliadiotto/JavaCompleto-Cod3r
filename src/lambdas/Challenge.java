package lambdas;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge {

    public static void main(String[] args) {




        /*BinaryOperator<Double> discountedPrice = (num1, num2) -> num1 * (1 - num2);
        System.out.printf("R$%.2f\n", discountedPrice.apply(product1.price, product1.discount));
        //double discountedPrice = product1.price * (1 - product1.discount);

        Function<Double, Double> municipalTax = price -> price >= 2500 ? (price * (1 - 0.85) + price) : 0;
        System.out.printf("R$%.2f\n", municipalTax.apply(product1.price));

        Function<Double, Double> deliveryFee = price -> price >= 3000.0 ? 100.0 + price : 50.0 + price;
        System.out.printf("R$%.2f\n", deliveryFee.apply(product1.price));

        Double finalPrice = discountedPrice
                .andThen(municipalTax)
                .andThen(deliveryFee)
                .apply(product1.price, product1.discount);

        System.out.printf("O valor total to produto com descontos e impostos é de R$%.2f.\n", finalPrice);
        */

        System.out.println("Official Answer:");
        Function<Product, Double> finalPrice = product -> product.price * (1 - product.discount);
        UnaryOperator<Double> municipalTax = price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> deliveryFee = price -> price >= 3000.0 ? 100.0 + price : 50.0 + price;
        //UnaryOperator<Double> round = price -> Double.parseDouble(String.format("%.2f", price));
        Function<Double, String> format = price -> ("R$" + price);

        Product product1 = new Product("iPad", 3235.89, 0.13);

        String price = finalPrice
                .andThen(municipalTax)
                .andThen(deliveryFee)
                //.andThen(round)
                .andThen(format)
                .apply(product1);
        System.out.printf("The final price is R$%.2f", price);


        /*
        1. Calcular o preco real (com desconto)/
        2. Imposto municipal? >= 2500 (8.5%) / < 2500 (isento)
        3. Frete: >= 3000 (100) / < 3000 (50)
        4. Arrendondar? 2 casas decimais
        5. Formatar: R$1234,56
        */
    }
}
