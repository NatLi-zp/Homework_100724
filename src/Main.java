import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = scan.nextLine();
        System.out.println("Length of first String:"+str1.length());

        System.out.println("Enter second String:");
        String str2 = scan.nextLine();
        System.out.println("Length of second String:"+str2.length());

        System.out.println(str1.substring(0,str1.length()/2)+str2.substring(str2.length()/2));
          }
}