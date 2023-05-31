package oo.heranca.desafio1;

import java.util.Locale;
import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Ferrari ferrari = new Ferrari();
        Carro civic = new Civic();
        ferrari.velocidadeAtual = 50;
        civic.velocidadeAtual = 50;

        System.out.println("Velocidade atual da Ferrari: " + ferrari.velocidadeAtual + "km/h");
        System.out.println("Velocidade atual do Civic: " + civic.velocidadeAtual + "km/h");

        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        civic.acelerar();
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();

        System.out.println(ferrari.velocidadeDoAr());

        System.out.println();
        System.out.println("Velocidade atual da Ferrari: " + ferrari.velocidadeAtual + "km/h");
        System.out.println("Velocidade atual do Civic: " + civic.velocidadeAtual + "km/h");


        ferrari.frear();
        civic.frear();


        System.out.println();
        System.out.println("Velocidade atual da Ferrari: " + ferrari.velocidadeAtual + "km/h");
        System.out.println("Velocidade atual do Civic: " + civic.velocidadeAtual + "km/h");

        sc.close();
    }
}
