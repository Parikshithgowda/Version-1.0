import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to perform subtraction");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(subtractNumbers(num1,num2));
        System.out.println("Enter two numbers to perform multiplication");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(multiplyNumbers(num1 , num2));
        System.out.println("Enter two numbers to perform division");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(divideNumbers(num1 , num2));
        System.out.println("Enter two numbers to find remainder");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(findRemainder(num1 , num2));

    }
    public static int subtractNumbers(int num1, int num2){

        return num1- num2;
    }
    public static int multiplyNumbers(int num1, int num2){

        return num1 * num2;
    }
    public static double divideNumbers(int num1, int num2){

        return num1 / num2;
    }
    public static int findRemainder(int num1, int num2){

        return num1 % num2;
    }
}