package HomeWork5;

import java.util.Scanner;

public class EnumsMain5 {
//    public static String nameColor;
    public static Color color1 = Color.ORANGE;
    public static Color color2 = Color.BLUE;
    public static Color color3 = Color.YELLOW;
    public static Color color4 = Color.RED;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название цвета");
        String nameColor = scan.nextLine();
        changeColor1(nameColor);
        changeColor2(nameColor);
        changeColor3(nameColor);
        changeColor4(nameColor);
        System.out.println(changeColor1(nameColor).toString());
        System.out.println(changeColor2(nameColor).toString());
        System.out.println(changeColor3(nameColor).toString());
        System.out.println(changeColor4(nameColor).toString());
        Color selectedColor = Color.valueOf(nameColor);
        System.out.println(selectedColor.toString());
        System.out.println(selectedColor.getId());
        System.out.println(selectedColor.getRusName());

       }

    public static Color changeColor4(String nameColor) {
        String red = Color.RED.toString();
        return color4;
    }
    public static Color changeColor3(String nameColor) {
        String yellow = Color.YELLOW.toString();
        return color3;
    }
    public static Color changeColor1(String nameColor) {
        String orange = Color.ORANGE.toString();
        return color1;

    }
    public static Color changeColor2(String nameColor) {
        String blue = Color.BLUE.toString();
        return color2;
    }


    }




