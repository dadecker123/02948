import java.util.Scanner;

public class Year {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int numberMonth = 0;
        int daysInMonth = 0;
        String month = "No Value";
        System.out.println("Please enter the number of your month. Example: January would be '1'");
        numberMonth = scanner.nextInt();
        System.out.println("Now, please enter your year in the format '20XX'");
        year = scanner.nextInt();
        scanner.close();
        
        switch(numberMonth){
            case 1:
                month = "January";
                daysInMonth = 31;
                break;
            case 2:
                month = "February";
                if(year%4==0){
                    daysInMonth = 29;
                }
                else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                month = "March";
                daysInMonth = 31;
                break;
            case 4:
                month = "April";
                daysInMonth = 30;
                break;
            case 5:
                month = "May";
                daysInMonth = 31;
                break;
            case 6:
                month = "June";
                daysInMonth = 30;
                break;
            case 7:
                month = "July";
                daysInMonth = 31;
                break;
            case 8:
                month = "August";
                daysInMonth = 31;
                break;
            case 9:
                month = "September";
                daysInMonth = 30;
                break;
            case 10:
                month = "October";
                daysInMonth = 31;
                break;
            case 11:
                month = "November";
                daysInMonth = 30;
                break;
            case 12:
                month = "December";
                daysInMonth = 31;
                break;
            default:
            System.out.println(month);
        }
        System.out.println("The month " + month + " has " + daysInMonth + " days in it.");
    }
}
