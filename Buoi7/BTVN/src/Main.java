import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Displayable {
    void displayInfo();
}

abstract class Person implements Displayable {
    protected String id;
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    private int age;
    private String grade;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    private List<Course> courses;

    public Student(String id, String name, int age, String grade) {
        super(id, name);
        this.age = age;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Courses enrolled:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Course implements Displayable {
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    private String courseId;
    private String courseName;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    @Override
    public void displayInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Students enrolled:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

class University {
    private List<Student> students;
    private List<Course> courses;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Get Students");
            System.out.println("2. Get Courses");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Add Course");
            System.out.println("6. Remove Course");
            System.out.println("7. Enroll Student in Course");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    getStudents(university);
                    break;
                case 2:
                    getCourses(university);
                    break;
                case 3:
                    addStudent(university, scanner);
                    break;
                case 4:
                    removeStudent(university, scanner);
                    break;
                case 5:
                    addCourse(university, scanner);
                    break;
                case 6:
                    removeCourse(university, scanner);
                    break;
                case 7:
                    enrollStudentInCourse(university, scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void getStudents(University university) {
        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println("Student ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Courses enrolled:");
            for (Course course : student.getCourses()) {
                System.out.println("- " + course.getCourseName());
            }
            System.out.println();
        }
    }

    private static void getCourses(University university) {
        List<Course> courses = university.getCourses();
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Students enrolled:");
            for (Student student : course.getStudents()) {
                System.out.println("- " + student.name);
            }
            System.out.println();
        }
    }

    private static void addStudent(University university, Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, age, grade);
        university.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent(University university, Scanner scanner) {
        System.out.print("Enter the ID of the student to remove: ");
        String id = scanner.nextLine();

        List<Student> students = university.getStudents();
        for (Student student : students) {
            if (student.id.equals(id)) {
                university.removeStudent(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void addCourse(University university, Scanner scanner) {
        System.out.print("Enter course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Course course = new Course(courseId, courseName);
        university.addCourse(course);
        System.out.println("Course added successfully.");
    }

    private static void removeCourse(University university, Scanner scanner) {
        System.out.print("Enter the ID of the course to remove: ");
        String courseId = scanner.nextLine();

        List<Course> courses = university.getCourses();
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                university.removeCourse(course);
                System.out.println("Course removed successfully.");
                return;
            }
        }

        System.out.println("Course not found.");
    }

    private static void enrollStudentInCourse(University university, Scanner scanner) {
        System.out.print("Enter the ID of the student to enroll: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter the ID of the course to enroll: ");
        String courseId = scanner.nextLine();

        List<Student> students = university.getStudents();
        Student student = null;
        for (Student s : students) {
            if (s.id.equals(studentId)) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        List<Course> courses = university.getCourses();
        Course course = null;
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                course = c;
                break;
            }
        }

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        student.enroll(course);
        course.enrollStudent(student);
        System.out.println("Student enrolled in course successfully.");
    }
}