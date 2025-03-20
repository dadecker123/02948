public class TuitionTenYear {
    public static void main(String args[]) {
        double tuition = 10000;
        double tuitionForYears = 0;
        for (int i = 1; i <= 14; i++) {
            tuition = tuition + (tuition * 0.05);
                if (i == 10){
                    System.out.println("Your tuition on year ten is: ");
                    System.out.printf("%.2f \n", tuition );
                }
                if (i > 10){
                    tuitionForYears = tuitionForYears + tuition;
                }
        }
        System.out.println("Your tuition for the final four years is: ");
        System.out.printf("%.2f", tuitionForYears);




    }
}
