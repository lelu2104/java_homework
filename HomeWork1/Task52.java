package HomeWork1;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Как тебя зовут?");
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = in.nextLine();
        switch (name) {
            case ("Вася"):
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал!");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
