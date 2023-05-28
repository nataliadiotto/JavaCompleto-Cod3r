package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão inseridos? ");
        int qtAlunos = sc.nextInt();

        System.out.print("Quantas notas serão inseridas? ");
        int qtNotas = sc.nextInt();

        double[][] notasAlunos = new double[qtAlunos][qtNotas];

        double total = 0;
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < qtNotas; j++) {
                System.out.print("Aluno " + (i + 1) + ", nota " + (j + 1) + ": ");
                notasAlunos[i][j] = sc.nextDouble();
                total += notasAlunos[i][j];
            }
        }
        double media = total / (qtAlunos * qtNotas);
        System.out.println("Média dos alunos: " + media);
        System.out.println();

        for (double[] notasAluno: notasAlunos) {
            System.out.println(Arrays.toString(notasAluno));
        }

        sc.close();
    }
}
