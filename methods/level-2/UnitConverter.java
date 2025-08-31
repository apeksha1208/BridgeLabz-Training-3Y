public class UnitConverter {
    
    // Distance conversions
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    
    // Weight conversions
    public static double convertPoundsToKg(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    public static double convertKgToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    
    // Volume conversions
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
    // Test method to demonstrate all conversions
    public static void main(String[] args) {
        System.out.println("=== Unit Converter Demo ===");
        
        // Distance conversions
        System.out.println("Distance Conversions:");
        System.out.printf("10 km = %.2f miles%n", convertKmToMiles(10));
        System.out.printf("5 miles = %.2f km%n", convertMilesToKm(5));
        System.out.printf("100 meters = %.2f feet%n", convertMetersToFeet(100));
        System.out.printf("50 feet = %.2f meters%n", convertFeetToMeters(50));
        System.out.printf("3 yards = %.2f feet%n", convertYardsToFeet(3));
        System.out.printf("9 feet = %.2f yards%n", convertFeetToYards(9));
        System.out.printf("1 meter = %.2f inches%n", convertMetersToInches(1));
        System.out.printf("39.37 inches = %.2f meters%n", convertInchesToMeters(39.37));
        System.out.printf("10 inches = %.2f cm%n", convertInchesToCm(10));
        
        // Temperature conversions
        System.out.println("\nTemperature Conversions:");
        System.out.printf("32°F = %.2f°C%n", convertFahrenheitToCelsius(32));
        System.out.printf("100°C = %.2f°F%n", convertCelsiusToFahrenheit(100));
        
        // Weight conversions
        System.out.println("\nWeight Conversions:");
        System.out.printf("10 pounds = %.2f kg%n", convertPoundsToKg(10));
        System.out.printf("5 kg = %.2f pounds%n", convertKgToPounds(5));
        
        // Volume conversions
        System.out.println("\nVolume Conversions:");
        System.out.printf("1 gallon = %.2f liters%n", convertGallonsToLiters(1));
        System.out.printf("3.785 liters = %.2f gallons%n", convertLitersToGallons(3.785));
    }
}
