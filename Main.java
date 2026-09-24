import java.util.Scanner;

public class Main {
    private static void squareRootGenerator(double number)
    {
        double result = Math.sqrt(number);
        System.out.println("The Square Root of the Number is:"+result);
    }
    private static void multiplyByItself(double number)
    {
        System.out.println("The Multiple is : "+(number * number));
    }
    public static void main(String[] args) {
        //creating the scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want square root of :");
        double number = sc.nextDouble();
        squareRootGenerator(number);
        multiplyByItself(number);
        sc.close();//closing the scanner object
    }
}
