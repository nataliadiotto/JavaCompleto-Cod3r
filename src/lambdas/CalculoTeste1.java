package lambdas;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTeste1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));

        sc.close();


    }

}
