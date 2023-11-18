package BTVN.Bai1;

import java.util.*;

public class ClassRoom {
    private static ArrayList<Student> classroom = new ArrayList<>();

    public static void sortByGpa() {
        for (int i = 0; i < classroom.size() - 1; i++) {
            for (int j = i; j < classroom.size(); j++) {
                if (classroom.get(i).getGpa() > classroom.get(j).getGpa()) {
                    Student temp = classroom.get(i);
                    classroom.set(i, classroom.get(j));
                    classroom.set(j, temp);
                }
            }
        }
    }

    public static void inputList() {
        for (Student newStudent : classroom) {
            newStudent = new Student();
            newStudent.input();
            classroom.add(newStudent);
        }
    }

    public static void outputList() {
        for (Student student : classroom) {
            student.output();
        }
    }

    public static boolean removebyId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int idToDelete = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < classroom.size(); i++) {
            if (classroom.get(i).getId() == idToDelete) {
                classroom.remove(i);
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        ArrayList<Student> classroom = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter student information");
            System.out.println("2. Print student information");
            System.out.println("3. Sort students by GPA");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputList();
                    break;
                case 2:
                    outputList();
                    break;
                case 3:
                    sortByGpa();
                    break;
                case 4:
                    if (removebyId())
                        System.out.println("Student has been deleted.");
                    else
                        System.out.println("Student with ID that you entered not found.");
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
