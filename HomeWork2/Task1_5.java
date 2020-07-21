package HomeWork2;

public class Task1_5 {
    public static void main(String[] args) {
        long a = 1;
        long c = 3;

        long lastResult = a;
        boolean error = false;
        do {
            long multiplication = lastResult * c;
            long xa = Math.abs(multiplication);
            long xc = Math.abs(c);

             if  (((xa | xc) >>> 31 != 0)) {

                 if (((c != 0) && (multiplication / c != lastResult)) ||
                         (lastResult == Long.MIN_VALUE && c == -1)) {
//                     System.out.println("Переполнение:" + lastResult);
                     error = true;
                 }
             }

              if (!error) {
                  lastResult = multiplication;
            }

        } while (!error);
        
        System.out.println("Последний корректный результат: " + lastResult);

    }
}


















