import java.util.Scanner;

public class VowelChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        String string = scanner.next();
        scanner.close();
        //c returns first letter in the string
        char c = string.charAt(0);
        // switch statement runs only if c has unicode value equal to a letter
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                switch(c) { 
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(c + " is a vowel.");
                    break;
                    default:
                        System.out.println(c + " is a consonant.");
                }
        // Any value of c not included in the list returns an error.
        } else {
            System.out.println("Unaccepted value.");
        }



    }
}