package HomeWork8_1;

import java.util.*;

import static HomeWork8_1.RandomString.random;

public class Main {
    public static void main(String[] args) {
        // создаём ArrayList
        List<Animal> data = new ArrayList<>();
        //заполняем ArrayList
        long start1 = System.currentTimeMillis(); // время до заполнения ArrayList
        for (int i = 0; i < 100_000; i++) {
            data.add(new Animal(random(20), random2(1, 15)));
        }
        long stop1 =System.currentTimeMillis();  // время после заполнения ArrayList
        System.out.println(stop1 - start1); // время заполнения ArrayList = 595
//        выводим в консоль ArrayList
//        for (Animal a : data) {
//            System.out.println(a);
//        }
        Collections.sort(data,new AnimalAgeComparator());
//        System.out.println("после сортировки" + data);
        long start2 = System.currentTimeMillis(); // время до удаления элементов из ArrayList
        for (int i = 0; i < 100_000; i++) {
            data.removeAll(data);
        }
        long stop2 =System.currentTimeMillis(); // время после удаления всех элементов из ArrayList
        System.out.println(stop2 - start2); // время удаления всех элементов из ArrayList = 8349
        System.out.println("после удаления" + data);


        // создаём LinkedList
        LinkedList<Person> data1 = new LinkedList<>();
        long start3 = System.currentTimeMillis(); // время до заполнения  LinkedList
        for (int i = 0; i < 100_000; i++) {
            data1.add(new Person(random(20), random3(5,10)));
        }
        long stop3 =System.currentTimeMillis(); // время после заполнения  LinkedList
        System.out.println(stop3 - start3); // время заполнения LinkedList = 2481
//        System.out.println("до сортировки " + data1);
        Collections.sort(data1,new PersonPasswordComparator());
//        System.out.println("после сортировки" + data1);
        Iterator<Person> personIterator = data1.iterator();  //создаем итератор
        long start4 = System.currentTimeMillis(); // время до удаления элементов из LinkedList
         do {
            personIterator.next();//получаем следующий элемент
            personIterator.remove();//удаляем элемент
         }  while(personIterator.hasNext());   //до тех пор, пока в списке есть элементы
        long stop4 =System.currentTimeMillis(); // время после удаления всех элементов из LinkedList
        System.out.println(stop4 - start4); // время удаления всех элементов из LinkedList = 72
        System.out.println("после удаления" + data1);

    }

    // метод для возраста в Animal
    public static int random2(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    //метод для пароля в Person
    public static String random3(int w, int q) {
        Random random3 = new Random();
        StringBuilder builder = new StringBuilder();
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = rus + rus.toUpperCase() + eng + eng.toUpperCase() + dig;
        for (int i = w; i <= q; i++) {
            int number1 = random3.nextInt(sum.length());
            char ch1 = sum.charAt(number1);
            builder.append(ch1);
        }
        return builder.toString();
    }


}




