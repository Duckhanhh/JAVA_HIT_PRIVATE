package Test.Bai2;

import java.sql.SQLOutput;
import java.util.*;

public class StudentServiceImpl implements StudentService {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getId() == id);
        System.out.println("Sinh vien da bi xoa!");
    }

    @Override
    public void searchStudent(String name) {
        for (Student student : studentList) {
            if (Objects.equals(student.getName(), name)) {
//                System.out.println("Id: " + student.getId());
//                System.out.println("Ten :" + student.getName());
//                System.out.println("Tuoi : " + student.getAge());
//                System.out.println("");
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void sortedStudent() {
        studentList.sort(Comparator.comparingDouble(Student::getScore).reversed());
        System.out.println("Da sap xep!");
    }

    @Override
    public void showAllStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString());
            System.out.println(student.getCapacity());
        }
    }
}
