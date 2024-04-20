import java.util.*;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Grades: ");
        int numGrades = scanner.nextInt();

        int[] grades = new int[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        int totalGrade = 0;
        for (int grade : grades) {
            totalGrade += grade;
        }
        double average = (double) totalGrade / numGrades;
        System.out.println("Average Grade is: " + average);

        scanner.close();
    }
}
