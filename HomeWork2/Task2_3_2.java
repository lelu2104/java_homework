package HomeWork2;

import java.util.Arrays;

public class Task2_3_2 {
    public static void main(String[] args) {
        int size = (int)(Math.random() * 100);//Размер массива от 0 до 99
        int array[] = new int[size]; // Создаём массив int размером size

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            // Заполняем массив элементами, случайными числами от 0 до 99
        }

        System.out.println("Выводим элементы массива, случайные числа:");
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

