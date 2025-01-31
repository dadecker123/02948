import java.util.Scanner;

public class Gratuity {
    public static void main(String args[]) {
        System.out.println("Please enter your subtotal: ");
            Scanner input = new Scanner(System.in);
            double subTotal = input.nextDouble();
        System.out.println("Please enter percent gratuity: ");
            double gratuity = input.nextDouble();
            double tip = subTotal * (gratuity / 100);
            double total = subTotal + tip;
        System.out.println("Your total is: " + total + " dollars.");




    }
}
