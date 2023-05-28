package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioForeach {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");
        int qtNotas = sc.nextInt();
        double[] notas = new double[qtNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.println();

        double total = 0;
        for (double nota: notas
             ) {
            total += nota;
        }

        System.out.println("Média do aluno: " + total / notas.length);




        sc.close();
    }
}
