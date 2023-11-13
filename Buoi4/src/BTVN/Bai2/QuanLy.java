package BTVN.Bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQl;
    private String tenQL;
    public QuanLy(){

    }
    public QuanLy(String maQl, String tenQL){
        this.maQl = maQl;
        this.tenQL = tenQL;
    }

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }
    public void xuat(){
        System.out.println("Ma QL: " + maQl);
        System.out.println("Ten QL: "+ tenQL);
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma QL: ");
        maQl = scanner.nextLine();
        System.out.println("Nhap ten QL: ");
        tenQL = scanner.nextLine();
    }
}
