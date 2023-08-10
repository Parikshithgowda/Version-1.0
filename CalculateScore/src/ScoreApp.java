import java.util.Scanner;

public class ScoreApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int marks = scan.nextInt();
        Demo d = new Demo();
        d.calculateScore(marks);
    }
}
