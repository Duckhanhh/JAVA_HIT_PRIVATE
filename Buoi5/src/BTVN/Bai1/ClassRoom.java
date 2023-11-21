package BTVN.Bai1;

import java.util.*;

public class ClassRoom {
    private static ArrayList<Student> classroom = new ArrayList<>();

    public static void fakeData() {
        classroom.add(new Student("ABC", 19, new Address("sdf", "dggdf", "sdfsd"), 1, "KHMT", 3.33F));
        classroom.add(new Student("DEF", 19, new Address("Caads", "fdfs", "sdfwe"), 2, "KHMT", 3.22F));
        classroom.add(new Student("XYZ", 20, new Address("qwe", "zcv", "wefef"), 3, "IT", 1.0F));
    }

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
        System.out.println("successful!!!");
    }

    public static void inputList() {
        do {
            Student student = new Student();
            student.input();
            classroom.add(student);
            if (student.getId() == 555) {
                break;
            }

        } while (true);
    }

    public static void outputList() {
        if (classroom.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Student student : classroom) {
                student.output();
            }
        }
    }

    public static boolean removebyId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int idToDelete = scanner.nextInt();
        boolean found = false;
        for (Student student : classroom) {
            if (student.getId() == idToDelete) {
                classroom.remove(student);
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
                    //fakeData();
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
