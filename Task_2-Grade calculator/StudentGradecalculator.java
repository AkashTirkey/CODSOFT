import java.util.*;

public class StudentGradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks obtained in subject: " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double avaeragePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (avaeragePercentage >= 90) {
            grade = "O";
        } else if (avaeragePercentage >= 80) {
            grade = "A";
        } else if (avaeragePercentage >= 70) {
            grade = "B";
        } else if (avaeragePercentage >= 60) {
            grade = "C";
        } else if (avaeragePercentage >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Perrcentage: " + avaeragePercentage);
        System.out.println("grade: " + grade);
        sc.close();
    }
}