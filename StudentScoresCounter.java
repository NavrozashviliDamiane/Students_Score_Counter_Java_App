import java.util.Scanner;


public class StudentScoresCounter {
    public static void main(String[] args) {
        Counter();

    }

    public static void Counter() {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 0;
        int passedStudents = 0;
        int failedStudents = 0;

        System.out.print("Enter the number of students:  ");

        totalStudents = scanner.nextInt();

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter score of student N" + i + " : ");
            int marks = scanner.nextInt();

            if (marks >= 50) {
                passedStudents++;
            } else {
                failedStudents++;
            };
        }

        System.out.println("Total students " + totalStudents);
        System.out.println("Passed students " + passedStudents);
        System.out.println("Failed students " + failedStudents);

    }
}
