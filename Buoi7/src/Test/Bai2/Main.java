package Test.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentServiceImpl studentService = new StudentServiceImpl();
        while (true) {
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. Xoa sinh vien theo id");
            System.out.println("3. Tim sinh vien theo ten");
            System.out.println("4. Sap xep danh sach sinh vien");
            System.out.println("5. Hien thi tat ca sinh vien");
            System.out.println("6. Thoat");
            System.out.println("======================");
            System.out.print("Moi ban nhap lua chon: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so sinh vien ban muon them: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ten hoc sinh: ");
                        String nameStudent = scanner.nextLine();
                        System.out.println("Nhap tuoi: ");
                        short ageStudent = scanner.nextShort();
                        scanner.nextLine();
                        System.out.println("Nhap ten quan: ");
                        String newDistrict = scanner.nextLine();
                        System.out.println("Nhap ten thanh pho: ");
                        String newCity = scanner.nextLine();
                        Address address = new Address(newDistrict, newCity);
                        System.out.println("Nhap diem: ");
                        int score = scanner.nextInt();
                        scanner.nextLine();
                        Student newStudent = new Student(nameStudent, ageStudent, address, score);
                        studentService.addStudent(newStudent);
                    }
                    break;
                case 2:
                    System.out.print("Nhap id cua sinh vien ban muon xoa: ");
                    int deletedId = scanner.nextInt();
                    studentService.deleteStudent(deletedId);
                    break;
                case 3:
                    System.out.println("Nhap ten sinh vien ban muon tim: ");
                    String name = scanner.nextLine();
                    studentService.searchStudent(name);
                    break;
                case 4:
                    studentService.sortedStudent();
                    break;
                case 5:
                    studentService.showAllStudent();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhap lai!!!");
            }
        }

    }
}
