import java.util.*;

public class FundamentalUnitConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user via the console
        Scanner scanner = new Scanner(System.in);

        // Display the main menu for the user to select which fundamental quantity to convert
        System.out.println("Fundamental Unit Converter");
        System.out.println("Choose the quantity to convert:");
        System.out.println("1. Length (meter <-> kilometer)");
        System.out.println("2. Mass (kilogram <-> gram)");
        System.out.println("3. Time (second <-> minute)");
        System.out.println("4. Electric Current (ampere <-> milliampere)");
        System.out.println("5. Temperature (kelvin <-> Celsius)");
        System.out.println("6. Amount of Substance (mole <-> millimole)");
        System.out.println("7. Luminous Intensity (candela <-> millicandela)");
        System.out.print("Enter your choice (1-7): ");

        int choice = scanner.nextInt();  // Read the user's choice for the fundamental quantity
        double input, result;             // Variables to store the user's input value and the conversion result

        // Use a switch statement to handle each fundamental quantity based on user's choice
        switch (choice) {
            case 1: // Length conversion
                // Show sub-menu for length conversion direction
                System.out.println("1. Meter to Kilometer");
                System.out.println("2. Kilometer to Meter");
                int lenChoice = scanner.nextInt();

                if (lenChoice == 1) {
                    // Convert meters to kilometers
                    System.out.print("Enter value in meters: ");
                    input = scanner.nextDouble();
                    // 1 kilometer = 1000 meters, so divide meters by 1000
                    result = input / 1000;
                    System.out.println(input + " meters = " + result + " kilometers");
                } else if (lenChoice == 2) {
                    // Convert kilometers to meters
                    System.out.print("Enter value in kilometers: ");
                    input = scanner.nextDouble();
                    // Multiply kilometers by 1000 to get meters
                    result = input * 1000;
                    System.out.println(input + " kilometers = " + result + " meters");
                } else {
                    System.out.println("Invalid choice for length conversion.");
                }
                break;

            case 2: // Mass conversion
                System.out.println("1. Kilogram to Gram");
                System.out.println("2. Gram to Kilogram");
                int massChoice = scanner.nextInt();

                if (massChoice == 1) {
                    // Convert kilograms to grams
                    System.out.print("Enter value in kilograms: ");
                    input = scanner.nextDouble();
                    // 1 kilogram = 1000 grams, so multiply by 1000
                    result = input * 1000;
                    System.out.println(input + " kilograms = " + result + " grams");
                } else if (massChoice == 2) {
                    // Convert grams to kilograms
                    System.out.print("Enter value in grams: ");
                    input = scanner.nextDouble();
                    // Divide grams by 1000 to get kilograms
                    result = input / 1000;
                    System.out.println(input + " grams = " + result + " kilograms");
                } else {
                    System.out.println("Invalid choice for mass conversion.");
                }
                break;

            case 3: // Time conversion
                System.out.println("1. Second to Minute");
                System.out.println("2. Minute to Second");
                int timeChoice = scanner.nextInt();

                if (timeChoice == 1) {
                    // Convert seconds to minutes
                    System.out.print("Enter value in seconds: ");
                    input = scanner.nextDouble();
                    // 1 minute = 60 seconds, so divide seconds by 60
                    result = input / 60;
                    System.out.println(input + " seconds = " + result + " minutes");
                } else if (timeChoice == 2) {
                    // Convert minutes to seconds
                    System.out.print("Enter value in minutes: ");
                    input = scanner.nextDouble();
                    // Multiply minutes by 60 to get seconds
                    result = input * 60;
                    System.out.println(input + " minutes = " + result + " seconds");
                } else {
                    System.out.println("Invalid choice for time conversion.");
                }
                break;

            case 4: // Electric current conversion
                System.out.println("1. Ampere to Milliampere");
                System.out.println("2. Milliampere to Ampere");
                int currChoice = scanner.nextInt();

                if (currChoice == 1) {
                    // Convert amperes to milliamperes
                    System.out.print("Enter value in amperes: ");
                    input = scanner.nextDouble();
                    // 1 ampere = 1000 milliamperes, multiply by 1000
                    result = input * 1000;
                    System.out.println(input + " amperes = " + result + " milliamperes");
                } else if (currChoice == 2) {
                    // Convert milliamperes to amperes
                    System.out.print("Enter value in milliamperes: ");
                    input = scanner.nextDouble();
                    // Divide milliamperes by 1000 to get amperes
                    result = input / 1000;
                    System.out.println(input + " milliamperes = " + result + " amperes");
                } else {
                    System.out.println("Invalid choice for electric current conversion.");
                }
                break;

            case 5: // Temperature conversion
                System.out.println("1. Kelvin to Celsius");
                System.out.println("2. Celsius to Kelvin");
                int tempChoice = scanner.nextInt();

                if (tempChoice == 1) {
                    // Convert kelvin to Celsius
                    System.out.print("Enter value in kelvin: ");
                    input = scanner.nextDouble();
                    // Celsius = Kelvin - 273.15
                    result = input - 273.15;
                    System.out.println(input + " kelvin = " + result + " Celsius");
                } else if (tempChoice == 2) {
                    // Convert Celsius to kelvin
                    System.out.print("Enter value in Celsius: ");
                    input = scanner.nextDouble();
                    // Kelvin = Celsius + 273.15
                    result = input + 273.15;
                    System.out.println(input + " Celsius = " + result + " kelvin");
                } else {
                    System.out.println("Invalid choice for temperature conversion.");
                }
                break;

            case 6: // Amount of substance conversion
                System.out.println("1. Mole to Millimole");
                System.out.println("2. Millimole to Mole");
                int moleChoice = scanner.nextInt();

                if (moleChoice == 1) {
                    // Convert moles to millimoles
                    System.out.print("Enter value in moles: ");
                    input = scanner.nextDouble();
                    // 1 mole = 1000 millimoles, multiply by 1000
                    result = input * 1000;
                    System.out.println(input + " moles = " + result + " millimoles");
                } else if (moleChoice == 2) {
                    // Convert millimoles to moles
                    System.out.print("Enter value in millimoles: ");
                    input = scanner.nextDouble();
                    // Divide millimoles by 1000 to get moles
                    result = input / 1000;
                    System.out.println(input + " millimoles = " + result + " moles");
                } else {
                    System.out.println("Invalid choice for amount of substance conversion.");
                }
                break;

            case 7: // Luminous intensity conversion
                System.out.println("1. Candela to Millicandela");
                System.out.println("2. Millicandela to Candela");
                int lumChoice = scanner.nextInt();

                if (lumChoice == 1) {
                    // Convert candela to millicandela
                    System.out.print("Enter value in candela: ");
                    input = scanner.nextDouble();
                    // 1 candela = 1000 millicandela, multiply by 1000
                    result = input * 1000;
                    System.out.println(input + " candela = " + result + " millicandela");
                } else if (lumChoice == 2) {
                    // Convert millicandela to candela
                    System.out.print("Enter value in millicandela: ");
                    input = scanner.nextDouble();
                    // Divide millicandela by 1000 to get candela
                    result = input / 1000;
                    System.out.println(input + " millicandela = " + result + " candela");
                } else {
                    System.out.println("Invalid choice for luminous intensity conversion.");
                }
                break;

            default:
                // Handle invalid main menu choices gracefully
                System.out.println("Invalid choice. Please run the program again and select a valid option.");
        }
    }
}
