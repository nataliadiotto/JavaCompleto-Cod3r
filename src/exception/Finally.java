package exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(7 / sc.nextInt());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { //força a execução, sempre é chamado
            System.out.println("Finally #01...");
            //sc.close();
        }

        try {
            System.out.println(7 / sc.nextInt());
        } finally { //em todas as situações o finally é chamado, mesmo sem o block catch
            System.out.println("Finally #02...");
        }

        System.out.println("The end.");

    }
}
