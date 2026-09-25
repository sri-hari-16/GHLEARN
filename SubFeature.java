import java.util.Scanner;

public class SubFeature {
    private static void moduloValue(int number1 ,int number2)
    {
        System.out.println("The value is : " + (number1 % number2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number one:");
        int number1 = sc.nextInt();
        System.out.print("Enter the number two:");
        int number2 = sc.nextInt();
        moduloValue(number1, number2);
        sc.close();
    }
}
