package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        int x = -45;
        int y = -15;

        System.out.println("Побитовые операции с числами " + a + " и " + b);

        System.out.println("a = " + a); //число 45 101101
 //     System.out.println(Integer.toBinaryString(a)); 101101
        int a1 = ~a;
        System.out.println("~a = " + a1);// число -46  11111111111111111111111111010010
//      System.out.println(Integer.toBinaryString(a1));

        System.out.println("b = " + b); //число 15 1111
//      System.out.println(Integer.toBinaryString(b)); 1111
        int b1 = ~b;
        System.out.println("~b = " + b1);// число -16  11111111111111111111111111110000
//      System.out.println(Integer.toBinaryString(b1)); 11111111111111111111111111110000

        System.out.println("a & b = " + (a & b));// равно 13 1101
//      System.out.println(Integer.toBinaryString(a & b));// 1101

        System.out.println("a | b = " + (a | b));// равно 47
//      System.out.println(Integer.toBinaryString(a | b));// 101111

        System.out.println("a ^ b = " + (a ^ b));// равно 34
//      System.out.println(Integer.toBinaryString(a ^ b));// 100010

        int z = (a << b);
        System.out.println("a << b = " + z);// равно 1474560
//      System.out.println(Integer.toBinaryString(z));// 101101000000000000000

        int z1 = (a >> b);
        System.out.println("a >> b = " + z1);// равно 0
//      System.out.println(Integer.toBinaryString(z1));// 0



        System.out.println("Побитовые операции с числами " + x + " и " + y);

        System.out.println("x = " + x); //число -45 11111111111111111111111111010011
//      System.out.println(Integer.toBinaryString(x));// 11111111111111111111111111010011
        int x1 = ~x;
        System.out.println("~x = " + x1);// число 44  101100
//      System.out.println(Integer.toBinaryString(x1)); // 101100

        System.out.println("y = " + y); //число -15 11111111111111111111111111110001
//      System.out.println(Integer.toBinaryString(y)); // 11111111111111111111111111110001
        int y1 = ~y;
        System.out.println("~y = " + y1);// число 14  1110
//      System.out.println(Integer.toBinaryString(y1)); // 1110

        System.out.println("x & y = " + (x & y));// равно -47 11111111111111111111111111010001
//      System.out.println(Integer.toBinaryString(x & y));// 11111111111111111111111111010001

        System.out.println("x | y = " + (x | y));// равно -13
//      System.out.println(Integer.toBinaryString(x | y));// 11111111111111111111111111110011

        System.out.println("x ^ y = " + (x ^ y));// равно 34
//      System.out.println(Integer.toBinaryString(x ^ y));// 100010

        int n = (x << y);
        System.out.println("x << y = " + n);// равно -5898240
//      System.out.println(Integer.toBinaryString(n));// 11111111101001100000000000000000

        int n1 = (x >> y);
        System.out.println("x >> y = " + n1);// равно -1
//      System.out.println(Integer.toBinaryString(n1));// 11111111111111111111111111111111


    }
}
