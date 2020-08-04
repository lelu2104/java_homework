package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 6;
        int f = 12;
        int g = 20;
        int h = 22;
        int i = 68;
        boolean z = true;
        boolean q = false;
        System.out.println(a + b / c); // 2/8=0, 0+5=5

        System.out.println((a + b) / c); // 5+2=7, 7/8=0

        System.out.println((a + b++) / c); // 2, 5+2=7, 7/8=0

        System.out.println((a + b++) / --c); // 2, 5+2=7, 7, 7/7=1

        System.out.println((a * b >>  b++) / --c); // 5*2=10, 2, 10>>2 ,
        // биты числа 10 (00001010) надо сдвинуть на  2 позиций в право 00000010, 2, --8=7, 2/7=0

       System.out.println((a + d > g ? i : h * b >>  b++) / --c);
       // 5+7=12>20, 22*2=44, 2, 44>>2, биты числа 44 (00101100) надо сдвинуть на  2 позиций в право 00001011, 11,
       //12>20?68:11, false, 11, --8=7, 11/7=1

//      System.out.println((a + d > g ? i >= i : h * b >> b++) / --c);
        // 5+7=12, 22*2=44>>2, 44>>2=11, i >= i (68>=68) true, 12>20?true:11, 12>20 false,
        // true/--8 невозможно т.к boolean/int два разных типа переменных

        System.out.println(e - b > 3  && f * f <= 119); // 12*12=144, 144<=199 -false, 6-2=4, 4>3, true && false = false

        System.out.println(z && q); // true && false = false


    }
}
