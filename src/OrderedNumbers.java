import java.util.Scanner;

public class OrderedNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Enter three numbers:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        displayOrderedNumbers(a, b, c);
        scanner.close();
    }

    public static void displayOrderedNumbers(double a, double b, double c){
        double hold = 0;
        if (a > b) {
            hold = a;
            a = b;
            b = hold;
        }
        if (a > c){
            hold = a;
            a = c;
            c = hold;
        }
        if (b > c){
            hold = b;
            b = c;
            b = hold;
        }
        System.out.println("Your sorted numbers are: " + a + " " + b + " " + " " + c);
    }
}

