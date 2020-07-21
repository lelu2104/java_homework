package HomeWork6;

public class CalculatorWithCounter {

    public double division(double a, double b) {
        if (!(a < Double.MAX_VALUE && a > Double.MIN_VALUE && b < Double.MAX_VALUE && b > Double.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        return a / b;
    }

    public double multiplication(double c, double d) {
        if (!(c < Double.MAX_VALUE && c > Double.MIN_VALUE && d < Double.MAX_VALUE && d > Double.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        return c * d;
    }

    public double addition(double s, double v) {
        if (!(s < Double.MAX_VALUE && s > Double.MIN_VALUE && v < Double.MAX_VALUE && v > Double.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        return s + v;
    }

    public double subtraction(double l, double k) {
        if (!(l < Double.MAX_VALUE && l > Double.MIN_VALUE && k < Double.MAX_VALUE && k > Double.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        return l - k;
    }

    public double sqr(int r) {
        if (!(r < Integer.MAX_VALUE && r > Integer.MIN_VALUE )) {
            System.out.println("Ввведиде валидное число!");
        }
        if(r == 0 || r == 1) {
            return r;
        }
        int start = 1, end = r / 2;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == r / mid) {
                return mid;
            }
            if(mid < r / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start - 1;
    }

    public double module(double t) {
        if (!(t < Double.MAX_VALUE && t > Double.MIN_VALUE )) {
            System.out.println("Ввведиде валидное число!");
        }
        if (t < 0) {
            t = t * (-1);
        } else {
            t = t;
        }
        return t;
    }

    public double exponentiation(double q, int w) {
        if (!(q < Double.MAX_VALUE && q > Double.MIN_VALUE && w < Integer.MAX_VALUE && w > Integer.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        double multiplication = 1;
        if (q > 0 && w != 0) {
            for (int i = 1; i <= w; i++) {
                multiplication *= q;
            }
        } else if (q == 0) {
            System.out.print(" 0 ");
        } else if (w == 0) {
            System.out.print(" 1 ");
        } else if (w < 0) {
            w = w * (-1);
            for (int i = 1; i <= w; i++) {
                multiplication /= q;
            }
            System.out.print(multiplication);

        } else {
            System.out.println("Введите другое число!");
        }
        return multiplication;
    }

    public int getCountOperation(int count) {
        return count = count +1;
    }
}
