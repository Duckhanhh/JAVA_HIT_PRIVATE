package BTVN.Bai1;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    public Student() {
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        id = scanner.nextInt();
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        gpa = scanner.nextFloat();
        super.input();
    }
    public void output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        super.output();
    }
    public boolean checkFall(){
        return gpa < criteria;
    }
}
