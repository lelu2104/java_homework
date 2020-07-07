package HomeWork3.colour;

public class Color {

    public Color(int a) {
    }
    private final int red = 1;
    private final int orange = 2;
    private final int yellow = 3;
    private final int green = 4;
    private final int blue = 5;
    private final int darkBlue = 6 ;
    private final int violet = 7;
    int Color;
    int a;

    public int getRed(int i) {
        return red;
    }

    public int getOrange(int i) {
        return orange;
    }

    public int getYellow(int i) {
        return yellow;
    }

    public int getGreen(int i) {
        return yellow;
    }

    public int getBlue(int i) {
        return blue;
    }

    public int getDarkBlue(int i) {
        return darkBlue;
    }

    public int getViolet(int i) {
        return violet;
    }

//    public Color(int red, int orange, int yellow, int green, int blue, int darkBlue, int violet) {
//        this.red = red;
//        this.orange = orange;
//        this.yellow = yellow;
//        this.green = green;
//        this.blue = blue;
//        this.darkBlue = darkBlue;
//        this.violet = violet;
//    }

    public void getNumber(int a) {
         if (a == 1) {
             System.out.println("red");
         }
         if (a == 2) {
            System.out.println("orange");
         }
         if (a == 3) {
            System.out.println("yellow");
         }
         if (a == 4) {
            System.out.println("green");
         }
         if (a == 5) {
            System.out.println("blue");
         }
         if (a == 6) {
            System.out.println("darkBlue");
         }
         if (a == 7) {
            System.out.println("violet");
         }
         if (a > 8 && a < 0) {
             System.out.println("unknown");
         }

    }
    public void getName(String color) {
        switch(Color) {
            default:
                System.out.println("Неизвестно!");
                break;
            case (red):
                System.out.println(1);
                break;
            case (orange):
                System.out.println(2);
                break;
            case (yellow):
                System.out.println(3);
                break;
            case (green):
                System.out.println(4);
                break;
            case (blue):
                System.out.println(5);
                break;
            case (darkBlue):
                System.out.println(6);
                break;
            case (violet):
                System.out.println(7);
                break;
        }

    }

}
