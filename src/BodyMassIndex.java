import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double weight = 0;
        double feet = 0;
        double inches = 0;
        System.out.println("Please enter your weight in pounds. ");
        weight = scanner.nextDouble();
        System.out.println("PLease enter your height, beginning with feet.");
        feet = scanner.nextDouble();
        System.out.println("Now enter inches.");
        inches = scanner.nextDouble();
        scanner.close();
        double heightCombined = (feet * 12) + inches;
        double holdOver = weight / (heightCombined * heightCombined);
        double bodyMass = holdOver * 703;
        System.out.println("Your BMI value is: " + bodyMass);
        
        if (bodyMass < 18.5){
            System.out.println("You are underweight.");
        }
        else if (bodyMass < 25){
            System.out.println("You fall within the normal range.");
        }
        else if (bodyMass > 25){
            System.out.println("You are overweight.");
        }
        
    
        }
    }

