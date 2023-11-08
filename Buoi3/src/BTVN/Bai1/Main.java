package BTVN.Bai1;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in);
        ArrayList<vegetable> vegetables = new ArrayList<vegetable>();
        do {
            System.out.printf("nhap vao lua chon: ");
            int choose = Ip.nextInt();
            if (choose == 1) {
                Ip.nextLine();
                System.out.printf("nhap id: ");
                String id = Ip.nextLine();
                System.out.printf("nhap ten: ");
                String name = Ip.nextLine();
                System.out.printf("nhap don vi tinh: ");
                String unit = Ip.nextLine();
                System.out.printf("nhap so luong: ");
                int soLuong = Ip.nextInt();
                System.out.printf("nhap pham tram giam gia: ");
                int sale = Ip.nextInt();
                System.out.printf("nhap gia san pham: ");
                double price = Ip.nextDouble();
                vegetable one = new vegetable(id, name, unit, soLuong, price);
                int check = 0;
                for (int i = 0; i < vegetables.size(); i++) {
                    if (vegetables.get(i).getId().equals(id)) {
                        check = 1;
                    }
                }
                if (check == 0) vegetables.add(one);
            }
            if (choose == 2) {
                System.out.printf("%-12s %-25s %-12s %-18s %-8s %-16s %-20s", "id", "name", "unit", "quantitySold", "sale", "price", "revenue");
                System.out.println();
                for (int i = 0; i < vegetables.size(); i++) {
                    vegetables.get(i).display();
                }
            }
            if (choose == 3) {
                Collections.sort(vegetables, new Comparator<vegetable>() {
                    @Override
                    public int compare(vegetable o1, vegetable o2) {
                        return (int) (o1.getTotalRevenue() - o2.getTotalRevenue());
                    }
                });
                System.out.println("SAP XEP XONG");
            }

            if (choose == 4) {
                ArrayList<vegetable> cuQua = vegetables;
                Collections.sort(cuQua, new Comparator<vegetable>() {
                    @Override
                    public int compare(vegetable o1, vegetable o2) {
                        return o1.getUnit().compareTo(o2.getUnit());
                    }
                });
                ArrayList<vegetable> ans = new ArrayList<vegetable>();
                vegetable Vg = new vegetable("", "", " ", 1, 1);
                cuQua.add(Vg);
                for (int i = 0; i < cuQua.size() - 1; i++) {
                    if (cuQua.get(i).getUnit().equals(cuQua.get(i + 1).getUnit())) {
                        ans.add(cuQua.get(i));
                    } else {
                        ans.add(cuQua.get(i));
                        for (int x = 0; x < ans.size(); x++) {
                            ans.get(x).display();
                        }
                        ans = new ArrayList<vegetable>();
                    }
                }
                cuQua.remove(cuQua.size() - 1);
            }

            if (choose == 5) {
                System.out.printf("Nhap ten loai rau cu qua ban muon tim kiem: ");
                Ip.nextLine();
                String name = Ip.nextLine();
                ArrayList<vegetable> ans = new ArrayList<vegetable>();
                for (int i = 0; i < vegetables.size(); i++) {
                    if (vegetables.get(i).getName().equals(name)) {
                        ans.add(vegetables.get(i));
                    }
                }
                if (ans.size() > 0) {
                    System.out.println("Thong tin ve san pham co ten vua nhap la : ");
                    System.out.printf("%-12s %-25s %-12s %-18s %-8s %-16s %-20s", "id", "name", "unit", "quantitySold", "sale", "price", "revenue");
                    System.out.println();
                    for (int i = 0; i < ans.size(); i++) {
                        ans.get(i).display();
                    }
                } else {
                    System.out.println("Khong tim thay san pham co ten vua nhap");
                }

            }
            if (choose == 6) return;
        } while (true);
    }
}


