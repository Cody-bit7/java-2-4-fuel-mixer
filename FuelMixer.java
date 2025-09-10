import java.util.Scanner;

public class FuelMixer {

    public static void main(String[] args) {
        // Named constant (hint: final) for the mixture.
         final double LOX_RECIPE = (2.56);
        // Variables for the adjusted mixture.
        double LOX;
        double RP1; 
        double fuel;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the amount of fuel being used.
        System.out.println("how many kilograms of fuel are needed for the test?");
        fuel = keyboard.nextDouble();
        // Close the keyboard scanner
        keyboard.close();
        // Calculate how much oxidizer is required for that much fuel.
        LOX = fuel * (2.56);
        // Calculate the total propellant weight
        RP1 = LOX + fuel;
        System.out.println("You need " + LOX + " kilograms of oxidizer for " + fuel + " kilograms of fuel.");
        System.out.println("the total weight of rp1 required is " + RP1 + " kilograms");
        // Display the outputs.
        LOX = keyboard.nextDouble();

        // Close the program
        System.exit(0);
    }
    
}
