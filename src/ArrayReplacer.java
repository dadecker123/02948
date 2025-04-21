import java.util.Arrays;
import java.util.Scanner;


public class ArrayReplacer {

    public static int[] eliminateDuplicates(int[] list) {
        int[] second = new int[list.length];
        int finalSize = 0;

        for (int i = 0; i < list.length; i++) {
            boolean duplicate = false;
            for (int f = 0; f < finalSize; f++) {
                if (list[i] == second[f]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                second[finalSize] = list[i];
                finalSize++;
            }
        }
        return Arrays.copyOf(second, finalSize);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten integers. ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] unique = eliminateDuplicates(numbers);

        System.out.print("List of distinct numbers: ");
        for (int number : unique) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
