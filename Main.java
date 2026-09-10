import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want square root of :");
        double number = sc.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("The Square Root of the Number is:"+result);
        sc.close();
    }
}
