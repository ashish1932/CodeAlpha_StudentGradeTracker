import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        // Initialize the ArrayList to store grades
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add a grade");
            System.out.println("2. View all grades");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Find highest grade");
            System.out.println("5. Find lowest grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a grade
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    grades.add(grade);
                    System.out.println("Grade added.");
                    break;

                case 2:
                    // Display all grades
                    System.out.println("Grades: " + grades);
                    break;

                case 3:
                    // Calculate average
                    if (!grades.isEmpty()) {
                        double total = 0;
                        for (double g : grades) {
                            total += g;
                        }
                        double average = total / grades.size();
                        System.out.printf("Average grade: %.2f\n", average);
                    } else {
                        System.out.println("No grades available.");
                    }
                    break;

                case 4:
                    // Find the highest grade
                    if (!grades.isEmpty()) {
                        double maxGrade = grades.get(0);
                        for (double g : grades) {
                            if (g > maxGrade) {
                                maxGrade = g;
                            }
                        }
                        System.out.printf("Highest grade: %.2f\n", maxGrade);
                    } else {
                        System.out.println("No grades available.");
                    }
                    break;

                case 5:
                    // Find the lowest grade
                    if (!grades.isEmpty()) {
                        double minGrade = grades.get(0);
                        for (double g : grades) {
                            if (g < minGrade) {
                                minGrade = g;
                            }
                        }
                        System.out.printf("Lowest grade: %.2f\n", minGrade);
                    } else {
                        System.out.println("No grades available.");
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
