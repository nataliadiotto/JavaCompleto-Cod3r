package arrays;

import java.util.Arrays;

public class exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println();

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println(notasAlunoA[i]);
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println("Média do aluno: " + totalAlunoA / notasAlunoA.length);
        System.out.println();

        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            System.out.println(notasAlunoB[i]);
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("Média do aluno: " + totalAlunoB / notasAlunoB.length);


    }
}
