package BTVN.Bai1;

import java.util.Scanner;

public class TacGia {
    Scanner scanner = new Scanner(System.in);
    private String tenTacGia;
    private int namSinh;

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tac gia: ");
        tenTacGia = scanner.nextLine();
        System.out.print("Nhap nam sinh tac gia: ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự new line sau khi nhập giá trị số
    }
    public void output() {
        System.out.println("Tac gia: " + tenTacGia);
        System.out.println("Sinh nam: " + namSinh);
        System.out.println("-----------------------------");
    }
}
