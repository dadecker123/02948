import java.util.Scanner;

public class ArrayOrdered {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double array[] = new double[10];
        System.out.println("Enter ten numbers for averaging.");
        for (int i = 0;i < array.length;i++){
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("The average is:" + average(array));
    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum = 0;
        for (int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

}
