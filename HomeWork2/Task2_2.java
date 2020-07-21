package HomeWork2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Ввести размер массива: ");
        int size = scanner.nextInt(); // Читаем с консоли размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером size
        System.out.println("Ввести элементы массива:");// Заполняем массив

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }

        System.out.print ("Выводим каждый второй элемент массива:");

        for (int i = 0; i < array.length; i++) {
            int mod = i % 2;
            if (mod != 0) {                        // Каждый второй элемент - это i = 1,3,5,7,9 и т.д.
                System.out.print(" " + array[i]); // Выводим на экран, каждый второй элемент массива
            }
            continue;
        }
        System.out.println();
    }

}

