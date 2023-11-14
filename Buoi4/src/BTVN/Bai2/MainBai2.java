package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBai2 {
    public static void main(String[] args) {
        PhongMay PhongMayMoi = new PhongMay();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập thông tin phòng máy");
            System.out.println("2. Xuất thông tin phòng máy");
            System.out.println("3. Tìm kiếm máy theo kiểu máy");
            System.out.println("4. Tìm kiếm máy theo mã máy");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    PhongMayMoi.nhap();
                    break;
                case 2:
                    PhongMayMoi.xuat();
                    break;
                case 3:
                    System.out.println("Nhap kieu may: ");
                    String kieuMay = scanner.nextLine();
                    PhongMayMoi.timKiem_tinhTrang(kieuMay);
                    break;
                case 4:
                    System.out.println("Nhap ma may: ");
                    int maMay = scanner.nextInt();
                    PhongMayMoi.timKiem_maMay(maMay);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Khong hop le, nhap lai!");
            }
        } while (true);
    }
}
