import java.util.Scanner;

public class ConvertorEuroDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sum Euro:");
        double sumEuro = scan.nextDouble();
        convertСurrency(sumEuro);

    }

    public static void convertСurrency(double sum) {
        double kurs = 1.0819;
        System.out.println("Kurs = " + kurs + "; Sum Dollar = " + sum * kurs);
    }
}
