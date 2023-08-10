import java.util.Scanner;

public class ControlConstructs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scan.nextInt();
        System.out.println("Welcome to KodNest");
        Control(marks);  //Method call
    }
    public static void Control(int marks){
        if(marks>=80){
            System.out.println("Welcome to Tech Club");
        }
    }
}
