import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String strStart = "";
        String strEnd = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = scan.nextLine();
        int lengthStr1 = str1.length();

        if (lengthStr1 % 2 == 0) {
            strStart = str1.substring(0, lengthStr1 / 2);
        } else {
            System.out.println("Error. Length of first String:" + str1.length());
        }

        System.out.println("Enter second String:");
        String str2 = scan.nextLine();
        int lengthStr2 = str2.length();

        if (lengthStr2 % 2 == 0) {
            strEnd = str2.substring(lengthStr2 / 2);
        } else {
            System.out.println("Error. Length of second String:" + str2.length());
        }

        if ((lengthStr1 % 2 == 0) && (lengthStr2 % 2 == 0)) {
            System.out.println(strStart + strEnd);
        } else {
            System.out.println("Incorrect data entered!");
        }
    }
}