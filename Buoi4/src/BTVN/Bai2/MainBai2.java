package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBai2 {
    public static void main(String[] args) {
        ArrayList<PhongMay> danhSachPhongMay = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập thông tin phòng máy");
            System.out.println("2. Xuất thông tin phòng máy");
            System.out.println("3. Tìm kiếm máy theo kiểu máy");
            System.out.println("4. Tìm kiếm máy theo mã máy");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    
            }
        } while (choice != 5);
    }

}
