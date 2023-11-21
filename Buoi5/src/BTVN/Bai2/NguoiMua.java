package BTVN.Bai2;

import java.util.Scanner;

public class NguoiMua {
    private String hoTenNguoiMua;
    private String tenNguoiMua;
    private String diaChiMua;
    private String stk;
    private String phuongThucTT;
    private String MST;
    final String cost = "VNĐ";

    public NguoiMua() {
    }

    public NguoiMua(String hoTenNguoiMua, String tenNguoiMua, String diaChiMua, String stk, String phuongThucTT, String MST) {
        this.hoTenNguoiMua = hoTenNguoiMua;
        this.tenNguoiMua = tenNguoiMua;
        this.diaChiMua = diaChiMua;
        this.stk = stk;
        this.phuongThucTT = phuongThucTT;
        this.MST = MST;
    }

    public String getHoTenNguoiMua() {
        return hoTenNguoiMua;
    }

    public void setHoTenNguoiMua(String hoTenNguoiMua) {
        this.hoTenNguoiMua = hoTenNguoiMua;
    }

    public String getTenNguoiMua() {
        return tenNguoiMua;
    }

    public void setTenNguoiMua(String tenNguoiMua) {
        this.tenNguoiMua = tenNguoiMua;
    }

    public String getDiaChiMua() {
        return diaChiMua;
    }

    public void setDiaChiMua(String diaChiMua) {
        this.diaChiMua = diaChiMua;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getPhuongThucTT() {
        return phuongThucTT;
    }

    public void setPhuongThucTT(String phuongThucTT) {
        this.phuongThucTT = phuongThucTT;
    }

    public String getMST() {
        return MST;
    }

    public void setMST(String MST) {
        this.MST = MST;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten day du: ");
        hoTenNguoiMua = scanner.nextLine();
        System.out.print("Nhap ten: ");
        tenNguoiMua = scanner.nextLine();
        System.out.print("Nhap dia chi nguoi mua: ");
        diaChiMua = scanner.nextLine();
        System.out.print("Nhap stk: ");
        stk = scanner.nextLine();
        System.out.print("Nhap phuong thuc thanh toan: ");
        phuongThucTT = scanner.nextLine();
        System.out.print("Nhap MST: ");
        MST = scanner.nextLine();
    }
    public void output(){
        System.out.println("-------------NGUOI MUA-------------");
        System.out.println("Ho ten: " + hoTenNguoiMua);
        System.out.println("Ten: " + tenNguoiMua);
        System.out.println("Dia chi: " + diaChiMua);
        System.out.println("STK: " + stk);
        System.out.println("Hinh thuc thanh toan" + phuongThucTT);
        System.out.println("Ma so thue: " + MST);
    }
}
