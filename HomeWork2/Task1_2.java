package HomeWork2;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int multiplication = 1;
        String s = " * ";

        if (a < 0 && a > Integer.MIN_VALUE) {
            a = a * (-1);
        } else if (a == 0) {
            System.out.println("Произведение цифр равно нулю!");
        } else if (a < Integer.MAX_VALUE) {
            a = a;
        } else {
            System.out.println("Введите другое целое число!");
        }

        System.out.println("Произведение цифр равно: ");

        for (int i = 1; i <= a; ++i) {
            System.out.print(i);
            System.out.print(s);
            multiplication *= i;
        }

        System.out.print(" = ");
        System.out.println(multiplication);

    }
}
