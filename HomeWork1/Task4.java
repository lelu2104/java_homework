package HomeWork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели, 1 - 7");
        int dayOfWeek = scanner.nextInt();

        if(dayOfWeek < 1 || dayOfWeek > 7){
            System.out.println("Вы ввели неправильный день недели");
            return;
        }

        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        if(month < 1 || month > 12){
            System.out.println("Вы ввели неправильный номер месяца");
            return;
        }

        sleepIn1(isWeekDay(dayOfWeek), isVacationMonth(month));

        System.out.println("Всего доброго");
    }

    public static boolean isWeekDay(int day){
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 7:
                return false;
        }
        return false;
    }

    public static boolean isVacationMonth(int month){
        switch (month){
            case 10:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 7:
            case 1:
            case 11:
            case 12:
                return false;
        }
        return false;
    }

    public static boolean sleepIn1(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            System.out.println("Спи");
            return true;
        } else {
            System.out.println("Вставай и иди на работу!");
            return false;
        }
    }


}

