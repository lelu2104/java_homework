package School;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import static School.RandomNameFamily.*;
import static School.RandomNameTeachers.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Выбирите сложность: Легко, Средне, Сложно. От сложности зависит сколько человек вам будет доступно для выбора. Легко - 25, Средне - 17, Сложно - 10");
        int level = scanner.nextInt();
        if (level == 25) {
            System.out.println("Сложность - легко");
        } else if (level == 17) {
            System.out.println("Сложность - средняя");
        } else if (level == 10) {
            System.out.println("Сложность - лёгкая");
        } else {
            System.out.println("Введите другое число");
        }

        System.out.println("Список учителей");
        LinkedList<Teacher> data1 = new LinkedList<>();
        for (int i = 0; i <= level ; i++) {
            data1.add(new Teacher(random2(), random1(), random3(), random4(1, 10), random4(1, 10), random.nextBoolean(), random4(20, 100)));
    }
        for (Teacher a : data1) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Список учеников");
        LinkedList<Student> data2 = new LinkedList<>();
        for (int i = 0; i <= 100 ; i++) {
            data2.add(new Student(random12(), random11(), random13(), random13(), random4(1, 5), random14(1), random4(1, 10), random4(1,10), random.nextBoolean(), random4(1, 10), random.nextBoolean(), random4(10, 100)));
        }
        for (Student b : data2) {
            System.out.println(b);
        }

        System.out.println("Запустить игру школа. Нажать - 1");
        int start = scanner.nextInt();
        if (start == 1) {
            System.out.println("Игра начата");
        } else {
            System.out.println("Введите 1!");
        }

        School school = new School();
        SchoolRest schoolRest = new SchoolRest(school);
        SchoolWork schoolWork = new SchoolWork(school);
        new Thread(schoolRest).start();
        new Thread(schoolWork).start();


}
}




