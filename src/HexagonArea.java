import java.util.Scanner;

public class HexagonArea {
    public static void main(String args[]) {
        System.out.println("Please enter the side length for the hexagon.");
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        scanner.close();
        // I created two doubles to show off the power function.
        double one = 6 * Math.pow(s, 2);
        double two = 4 * Math.tan(Math.PI/6);
        double area = one / two;
        System.out.println("The area of your hexagon is:");
        //%f used to limit response's # of decimal places.
        System.out.printf("%.2f", area);


    }
}
