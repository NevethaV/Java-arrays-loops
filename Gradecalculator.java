import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Grades: ");
        int numGrades = scanner.nextInt();

        int[] grades = new int[numGrades];

        // Input grades
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average grade
        int totalGrade = 0;
        for (int grade : grades) {
            totalGrade += grade;
        }
        double average = (double) totalGrade / numGrades;

        // Display average grade
        System.out.println("Average Grade is: " + average);

        scanner.close();
    }
}
