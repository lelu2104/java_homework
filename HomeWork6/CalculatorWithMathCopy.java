package HomeWork6;

public class CalculatorWithMathCopy {

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


    public double sqrt(double r) {
        if (!(r < Integer.MAX_VALUE && r > Integer.MIN_VALUE )) {
            System.out.println("Ввведиде валидное число!");
        }
        return StrictMath.sqrt(r);
    }

    public double exponentiation(double q, int w) {
        if (!(q < Double.MAX_VALUE && q > Double.MIN_VALUE && w < Integer.MAX_VALUE && w > Integer.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        return Math.pow(q,w);
    }

    public double module(double t) {
        if (!(t < Double.MAX_VALUE && t > Double.MIN_VALUE)) {
            System.out.println("Ввведиде валидное число!");
        }
        return Math.abs(t);
    }


}
