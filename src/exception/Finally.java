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
            System.out.println("Finally...");
            sc.close();
        }

        System.out.println("The end.");

    }
}
