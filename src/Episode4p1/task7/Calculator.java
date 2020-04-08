package Episode4p1.task7;

/*
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double division(int a, int b) {
        double v = (a * (1.0)) / (b * (1.0));
        return (v);
    }
    public static double percent(int a, int b) {
        double v = ((a * (1.0)) / 100) * (b * (1.0));
        return (v);
    }
    public static void main(String[] args) {
    }
}
