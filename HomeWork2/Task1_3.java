package HomeWork2;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int a_create;
        int multiplication = 1;
        String s = " * ";

        if (a < 0 && a > Integer.MIN_VALUE) {
            a = a * (-1);
        } else if (a == 0) {
            System.out.println("Произведение цифр числа равно нулю!");
        } else if (a < Integer.MAX_VALUE) {
             a = a;
        } else {
            System.out.println("Введите другое целое число!");
        }

        System.out.println("Произведение цифр числа равно:");
        for ( ; a > 0; a/=10) {
            a_create = a % 10;
            System.out.print(a_create);
            System.out.print(s);
            multiplication *= a_create;
        }

        System.out.print(" = ");
        System.out.println(multiplication);

    }

}
