import java.util.Scanner;

public class GradeStats {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Using a constant improves readability
        final int TOTAL_GRADES = 10;

        // Using an array allows us to store all grades and loop through them.
        double[] grades = new double[TOTAL_GRADES];

        // Loop to collect all grades from the user
        for (int i = 0; i < TOTAL_GRADES; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }
        // This avoids needing a separate "firstGrade" variable.
        double sum = grades[0];
        double max = grades[0];
        double min = grades[0];

        // Loop through remaining grades to compute statistics.
        for (int i = 1; i < TOTAL_GRADES; i++) {
            double grade = grades[i];
            sum += grade;

            if (grade > max) {
                max = grade; // Update highest grade
            }
            if (grade < min) {
                min = grade; // Update lowest grade
            }
        }

        // Calculate average.
        double average = sum / TOTAL_GRADES;

        // Display results.
        System.out.println("\n****** Class Statistics ******");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);

        input.close(); 
    }
}
