package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Как тебя зовут?");
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = in.nextLine();
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (Objects.equals(name, name1)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        } else if  (Objects.equals(name, name2)) {
                System.out.println("Я тебя так долго ждал!");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
    }
}
