package HomeWork8_1;

import java.util.Random;

public class RandomString {

     public static String random(int stringLength) {
         String choice = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ёйцукенгшщзхъфывапролджэячсмитьбюЁЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
         Random random = new Random();
         StringBuilder builder = new StringBuilder();
         for (int i = 0; i < stringLength; i++) {
             int number = random.nextInt(choice.length());
             char ch = choice.charAt(number);
             builder.append(ch);
         }
         return builder.toString();
     }

}
