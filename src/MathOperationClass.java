public class MathOperationClass {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        System.out.println("Сложение " + num1 + " и " + num2 + " = " + add(num1, num2));
        System.out.println("Вычитание " + num1 + " и " + num2 + " = " + subtract(num1, num2));
        System.out.println("Умножение " + num1 + " и " + num2 + " = " + multiply(num1, num2));
        System.out.println("Деление " + num1 + " и " + num2 + " = " + division(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }
}
