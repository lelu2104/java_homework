package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Ввести размер массива: ");
        int size = scanner.nextInt(); // Читаем с консоли размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером size
        System.out.println("Ввести элементы массива:");// Заполняем массив

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }
        System.out.println("Выводим элементы массива:");

        System.out.println(Arrays.toString(array));// Выводим массив

    }

}

