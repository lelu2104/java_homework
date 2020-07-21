package HomeWork6;

public class MainClass {

    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy сalculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorStringExpression calculatorStringExpression = new CalculatorStringExpression();
        double result;
        double result2;
        double result3;
        String str = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        System.out.println("Используем CalculatorWithOperator");
        result = calculatorWithOperator.addition(calculatorWithOperator.addition(4.1,calculatorWithOperator.multiplication(15,7)),calculatorWithOperator.exponentiation(calculatorWithOperator.division(28,5),2));
        System.out.println(" 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("============================================");

        System.out.println("Деление на 0:");
        System.out.println(result / 0); // infinity т.к result имеет тип double c плавающей запятой
//        System.out.println((int)result / 0); //Еxception in thread "main" java.lang.ArithmeticException: / by zero выдаст  арифметическую ошибку т.к
//        тип result - int - целочисленное значение;
        System.out.println(calculatorWithOperator.division(result, 0)); // На ноль делить нельзя! т.к заложили условие в методе division
//        infinity т.к result имеет тип double c плавающей запятой
        System.out.println("============================================");


        System.out.println("Деление на 0.0d:");
        System.out.println(calculatorWithOperator.division(result, 0.0d));
        //infinity -0.0 является двойным литералом, и это не считается абсолютным нулем!
        // Не исключение, потому что считается, что двойная переменная достаточно велика, чтобы содержать значения, представляющие близкую бесконечность!
        System.out.println(calculatorWithOperator.division((int)result, 0.0d));
        //infinity -0.0 является двойным литералом, и это не считается абсолютным нулем!
        // Не исключение, потому что считается, что двойная переменная достаточно велика, чтобы содержать значения, представляющие близкую бесконечность!
        System.out.println("============================================");

        System.out.println("Используем CalculatorWithMathCopy");
        result2 = сalculatorWithMathCopy.addition(сalculatorWithMathCopy.addition(4.1,сalculatorWithMathCopy.multiplication(15,7)),сalculatorWithMathCopy.exponentiation(сalculatorWithMathCopy.division(28,5),2));
        System.out.println(" 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);
        System.out.println("============================================");

        System.out.println("Используем СalculatorWithMathExtends");
        result3 = calculatorWithMathExtends.addition(calculatorWithMathExtends.addition(4.1,calculatorWithMathExtends.multiplication(15,7)),calculatorWithMathExtends.exponentiation(calculatorWithMathExtends.division(28,5),2));
        System.out.println(" 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result3);
        System.out.println("============================================");

        System.out.println("Используем CalculatorStringExpression");
        System.out.println(calculatorStringExpression.needToBeSolve(str));




    }


}
