package HomeWork2;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Введите степень числа:");
        double b = in.nextDouble();
        System.out.println("Ответ (число " + a + " в степени " + b + " ):");
        System.out.println(Math.pow(a,b));

    }
}
