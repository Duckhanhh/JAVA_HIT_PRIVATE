package BTVN.Bai1;

import java.util.Scanner;

public class Person{
    protected String name;
    protected int age;
    protected Address address = new Address();

    public Person() {
    }
    public Person(String name, int age, Address address) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        address.input();
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        address.output();
    }
}
