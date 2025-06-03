
import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
    

        double percentage;

        if (salary <= 400.00) {
            percentage = 15;
        } else if (salary <= 800.00) {
            percentage = 12;
        } else if (salary <= 1200.00) {
            percentage = 10;
        } else if (salary <= 2000.00) {
            percentage = 7;
        } else {
            percentage = 4;
        }

        double increase = salary * (percentage / 100);
        double newSalary = salary + increase;

        System.out.printf("New salary: %.2f\n", newSalary);
        System.out.printf("Money earned: %.2f\n", increase);
        System.out.printf("In percentage: %.0f %%\n", percentage);

        sc.close(); 
    }
}
