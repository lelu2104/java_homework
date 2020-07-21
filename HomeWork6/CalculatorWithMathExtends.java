package HomeWork6;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public double division(double a, double b) {
        return super.division(a, b);
    }

    public double multiplication(double c, double d) {
        return super.multiplication(c, d);
    }

    public double addition(double s, double v) {
        return super.addition(s, v);
    }

    public double subtraction(double l, double k) {
        return super.subtraction(l, k);
    }

    @Override
    public double exponentiation(double q, int w) {
        return Math.pow(q,w);
    }

    @Override
    public double sqr(int r) {
        return StrictMath.sqrt(r);
    }

    @Override
    public double module(double t) {
        return Math.abs(t);
    }
}
