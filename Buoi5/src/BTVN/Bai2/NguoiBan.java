package BTVN.Bai2;

import java.util.Scanner;

public class NguoiBan {
    final private String tenNguoiBan = "CÔNG TY TNHH A";
    final private String maThue = "010023400";
    final static String diaChiBan = "45 phố X , quận Y , thành phố Hà Nội ";
    private String stk;
    private String sdt;

    public NguoiBan() {
    }

    public NguoiBan(String stk, String sdt) {
        this.stk = stk;
        this.sdt = sdt;
    }

    public String getSTK() {
        return stk;
    }

    public void setSTK(String stk) {
        this.stk = stk;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card number : ");
        this.stk = scanner.nextLine();
        System.out.print("Enter phone number : ");
        this.sdt = scanner.nextLine();
    }
    public void output(){
        System.out.println("--------------NGUOI BAN--------------");
        System.out.println("Ten nguoi ban: " + tenNguoiBan);
        System.out.println("Ma so thue: " + maThue);
        System.out.println("Dia chi: " + diaChiBan);
        System.out.println("So tai khoan: " + stk);
        System.out.println("Dien thoai: " + sdt);
    }
}
