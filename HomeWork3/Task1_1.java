package HomeWork3;

public class Task1_1 {
    public static void main(String[] args) {
        int [] array = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int x = 0;
        int count = 0; // счётчик элементов, считает повторяющиеся элементы

        System.out.println("Элемент массива, встречающийся нечётное количество раз:");

        for (int i = 0; i < array.length; i++) {
            do {
                for (i = 0; i < array.length; i++) {
                    do {
                        if (array[x] < array[i]) {
                            count = count;
                        }
                        if (array[x] > array[i]) {
                            count = count;
                        }
                        if (array[x] == array[i]) {
                            count++;
                        }
                        i++;
                    }
                    while (i < array.length);
//                    System.out.println(count);
                }
                if (count % 2 != 0) { // выявляет нечётное количество раз, когда встречается элемент массива
                    System.out.println("array[i]= " + array[x]);
                    System.out.println("Элемент массива повторяется " + count + " раз");
                    break;
                }
                count = 0;
                x++;
            }
            while (x < array.length);

        }

    }
}
