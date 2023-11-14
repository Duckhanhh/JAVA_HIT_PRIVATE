package BTVN.Bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainBai1 {
    private static void timKiemSach(ArrayList<SACH> danhSachSach, String tenSachCanTim) {
        ArrayList<SACH> ketQuaTimKiem = new ArrayList<>();
        for (SACH sach : danhSachSach) {
            if (sach.getTenSach().toLowerCase().contains(tenSachCanTim.toLowerCase())) {
                ketQuaTimKiem.add(sach);
            }
        }

        if (!ketQuaTimKiem.isEmpty()) {
            System.out.println("\nKet qua tim kiem:");
            for (SACH sach : ketQuaTimKiem) {
                sach.output();
            }
        } else {
            System.out.println("\nKhong tim thay sach.");
        }
    }
    public static void sapXepTheoTacGia(ArrayList<SACH> danhSachSach){
        danhSachSach.sort(Comparator.comparing(sach -> sach.getX().getTenTacGia()));
        System.out.println("Da sap xep theo ten tac gia");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SACH> danhSachSach = new ArrayList<>();
        TacGia tacGia1 = new TacGia("Tác giả 1", 1980);
        TacGia tacGia2 = new TacGia("Tác giả 2", 1990);
        TacGia tacGia3 = new TacGia("Tác giả 3", 1975);
        TacGia tacGia4 = new TacGia("Tác giả 4", 1985);
        TacGia tacGia5 = new TacGia("Tác giả 5", 1995);
        danhSachSach.add(new SACH(1,"Sach 1",2022,"ki", tacGia1));
        danhSachSach.add(new SACH(2,"Sach 2",1999,"tieuthuyet", tacGia2));
        danhSachSach.add(new SACH(3,"Sach 3",1999,"tieuthuyet", tacGia3));
        danhSachSach.add(new SACH(4,"Sach 4",1999,"tieuthuyet", tacGia4));
        danhSachSach.add(new SACH(5,"Sach 5",1999,"tieuthuyet", tacGia5));
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap thong tin sach");
            System.out.println("2. In thong tin sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Sap xep sach theo ten tac gia");
            System.out.println("5. Thoat truong trinh");
            int luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("Nhap so luong sach: ");
                    int soluong = sc.nextInt();
                    for (int i = 0; i < soluong; i++) {
                        SACH sachMoi = new SACH();
                        sachMoi.input();
                        danhSachSach.add(sachMoi);
                    }
                    break;
                case 2:
                    for (SACH sach : danhSachSach) {
                        sach.output();
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten sach can tim: ");
                    sc.nextLine();
                    String tenCanTim = sc.nextLine();
                    timKiemSach(danhSachSach, tenCanTim);
                    break;
                case 4:
                    sapXepTheoTacGia(danhSachSach);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Khong hop le, nhap lai!");
            }
        }
    }
}
