import java.util.Scanner;

public class JourneyCalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed and time");
        double speed = scan.nextDouble();
        double time = scan.nextDouble();
        JourneyCalculator journeyCalculator = new JourneyCalculator();

        journeyCalculator.calculateDistance(speed,time);
        System.out.println(journeyCalculator.calculateDistance(speed,time));

    }
}
