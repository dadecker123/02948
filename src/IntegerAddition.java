import java.util.Scanner;

public class IntegerAddition{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        long num = scanner.nextLong();
        System.out.println("The sum of every digit in your integer is " + sumDigits(num));
    }
    public static int sumDigits(long n){
        int sumDigits = 0;
        long temp = (long)Math.abs(n);
        while (temp != 0){
            sumDigits += (temp % 10);
            temp = (temp / 10);
        }
        
        return sumDigits;
    }

    
}
