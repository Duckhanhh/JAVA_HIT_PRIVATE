package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private QuanLy x = new QuanLy();
    private int n;
    private ArrayList<May> y = new ArrayList<>();


    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, QuanLy x, ArrayList<May> y) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public ArrayList<May> getY() {
        return y;
    }

    public void setY(ArrayList<May> y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = scanner.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = scanner.nextLine();
        x.nhap();
        System.out.println("Nhap so luong may tinh: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            May mayMoi = new May();
            mayMoi.nhap();
            y.add(mayMoi);
        }
    }
    public void xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        x.xuat();
        for (May may: y
             ) {
            may.xuat();
        }
    }

    public void timKiem_tinhTrang(String tinhTrang){
        boolean check = false;
        for(May may : y){
            if(may.getTinhTrang().equals(tinhTrang)){
                may.xuat();
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong tim thay!");
        }
    }
    public void timKiem_maMay(int maMay){
        boolean check = false;
        for(May may : y){
            if(may.getMaMay() == maMay){
                may.xuat();
                check = true;
            }
        }
        if(!check){
            System.out.println("Khong tim thay!");
        }
    }
}
