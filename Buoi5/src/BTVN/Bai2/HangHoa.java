package BTVN.Bai2;

import java.util.Scanner;

public class HangHoa {
    private String tenHang;
    private String donViTinh;
    private int soLuong;
    private int donGia;

    public HangHoa() {
    }

    public HangHoa(String tenHang, String donViTinh, int soLuong, int donGia) {
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int thanhTien() {
        return this.donGia * this.soLuong;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap don vi tinh: ");
        donViTinh = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-25s %-15s %-15s %-15s %-22s\n", tenHang, donViTinh, soLuong, donGia, thanhTien());
    }
}
