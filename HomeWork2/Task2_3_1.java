package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3_1 {
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

        System.out.println("Выводим элементы массива с помощью алгоритма пузырёк:");
        // Алгоритм пузырёк
        for (int i = array.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы массива попарно,если они имеют неправильный порядок,то меняем местами
                if (array[j] > array[j + 1]) {
                    int w = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = w;
                }
            }
        }
        System.out.println(Arrays.toString(array));// Выводим отсортированный массив

    }
}

