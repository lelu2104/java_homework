package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        int l = 1;
        do{
            for (int i = 2; i <= 5; i++) {
                int s = i * l;
                System.out.printf("%3d", i);
                System.out.printf(" *");
                System.out.printf("%3d", l);
                System.out.printf(" =");
                System.out.printf("%3d", s);
            }
            System.out.println();
            l++;
        }
        while(l <= 10);

        System.out.println("  ");

        l = 1;
        do{
            for (int i = 6; i <= 9; i++) {
            int s = i * l;
            System.out.printf("%3d", i);
            System.out.printf(" *");
            System.out.printf("%3d", l);
            System.out.printf(" =");
            System.out.printf("%3d", s);
            }
        System.out.println();
        l++;
        }
        while(l <= 10);

    }
}






