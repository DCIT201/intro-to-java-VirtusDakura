import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConverting = true;

        // Display the welcome message
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("You can convert temperatures between Celsius and Fahrenheit.");

        // Loop to continue converting until the user chooses to stop
        while (continueConverting) {
            // Display the menu options
            System.out.println("\nTemperature Converter Options:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");

            // Ask the user to choose an option
            System.out.print("Enter the option number (1, 2, or 3): ");
            int option = 0;

            // Validate the user's choice for option
            while (true) {
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    if (option == 1 || option == 2 || option == 3) {
                        break; // Exit the loop if input is valid
                    } else {
                        System.out.println("Invalid option. Please enter 1, 2, or 3.");
                        System.out.print("Enter the option number (1, 2, or 3): ");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number (1, 2, or 3).");
                    scanner.next(); // Consume the invalid input
                    System.out.print("Enter the option number (1, 2, or 3): ");
                }
            }

            // Exit the program if the user chooses option 3
            if (option == 3) {
                continueConverting = false;
                break; // Exit the loop
            }

            // Ask the user for the temperature value
            System.out.print("Enter the temperature value: ");
            double temperature = 0;

            // Validate the user's temperature input
            while (true) {
                if (scanner.hasNextDouble()) {
                    temperature = scanner.nextDouble();
                    break; // Exit the loop if the input is valid
                } else {
                    System.out.println("Invalid temperature value. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                    System.out.print("Enter the temperature value: ");
                }
            }

            // Perform the conversion based on the user's choice
            if (option == 1) {
                // Celsius to Fahrenheit conversion
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", temperature, fahrenheit);
            } else if (option == 2) {
                // Fahrenheit to Celsius conversion
                double celsius = (temperature - 32) * 5/9;
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", temperature, celsius);
            }

            // Ask the user if they want to convert again
            System.out.print("Would you like to convert again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            // If the user answers anything other than "yes", stop the loop
            if (!response.equals("yes")) {
                continueConverting = false;
            }
        }

        // Close the scanner object
        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
