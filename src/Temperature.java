import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        //asks user for celsius value
        System.out.println("Please enter your temperature in Celsius:" );
        //Instantiates scanner
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        //Retrieves value from input
        double celsius = input.nextDouble();
        //Initializes fahreneheit variable
        double fahrenheit = 0;
        //performs celsius to fahrenheit calculation
        fahrenheit = (9.0 / 5) * celsius + 32;
        //prints value 
        System.out.println("Your temperature in Fahreneheit is: " + fahrenheit); 
    }
}
