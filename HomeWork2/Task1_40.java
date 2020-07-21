package HomeWork2;

import java.util.Scanner;

public class Task1_40 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Введите целую степень числа:");
        double b = in.nextDouble();
        double multiplication = 1;
        String s = " * ";


        System.out.println("Ответ (число " + a + " в степени " + b + " ):");

        if (b > 0 && a != 0) {
            for (int i = 1; i <= b; i++) {
                System.out.print(a);
                System.out.print(s);
                multiplication *= a;
            }
            System.out.print(" = ");
            System.out.println(multiplication);

            } else if (a == 0) {
            System.out.print(" 0 ");

                } else if (b == 0) {
                 System.out.print(" 1 ");

                    } else if (b < 0) {
                    b = b * (-1);
                    for (int i = 1; i <= b; i++) {
                        multiplication /= a;
                    }
                    System.out.print(multiplication);

                        } else {
                        System.out.println("Введите другое число!");
                        }

    }
}
