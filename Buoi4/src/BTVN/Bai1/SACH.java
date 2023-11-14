package BTVN.Bai1;

import java.util.Scanner;

public class SACH {
    private static int nextId = 1;
    private int id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x = new TacGia();

    public SACH() {
    }

    public SACH(int id, String tenSach, int namXuatBan, String theLoai, TacGia x) {
        this.id = nextId++;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.x = x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return this.x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    public void output() {
        System.out.println("Thong tin ve sach:");
        System.out.println("id: " + id);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("The loai: " + theLoai);
        x.output();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id sach: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap the loai: ");
        theLoai = scanner.nextLine();
        x.input();
    }
}
