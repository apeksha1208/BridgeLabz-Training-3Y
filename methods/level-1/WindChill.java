import java.util.Scanner;

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        if (temperature <= 50 && windSpeed >= 3 && windSpeed <= 120) {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);
        } else {
            System.out.println(
                    "Note: Wind chill calculation is most accurate for temperatures ≤ 50°F and wind speeds between 3-120 mph.");
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);
        }

        scanner.close();
    }
}
