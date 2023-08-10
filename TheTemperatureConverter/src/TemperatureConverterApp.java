import java.util.Scanner;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit that need to be calculated");
        double fahrenheit = scan.nextDouble();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
        System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));

    }
}
