package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {
    private static ArrayList<HangHoa> hoadon = new ArrayList<>();
    static NguoiBan company = new NguoiBan();
    static NguoiMua customer = new NguoiMua();
    static HangHoa products = new HangHoa();
    static final String sign = "2C21TBB";
    static final int number = 98723;
    static final int day = 15;
    static final int month = 10;
    static final int year = 2021;

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang hoa: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            HangHoa hang = new HangHoa();
            hang.input();
            hoadon.add(hang);
        }
    }
    public static void output(){
        for(int i=0;i<hoadon.size()-1;i++)
        {
            for(int j=i;j<hoadon.size();j++){
                if(hoadon.get(i).getDonGia()> hoadon.get(j).getDonGia()){
                    HangHoa temp = hoadon.get(i);
                    hoadon.set(i, hoadon.get(j));
                    hoadon.set(j, temp);
                }
            }
        }
        int tong = 0;
        for (HangHoa hang : hoadon){
            hang.output();
            tong += hang.thanhTien();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Tong so tien can thanh toan la: " + tong);
    }
    public static void main(String[] args) {
        company.input();
        customer.input();
        input();
        System.out.println("========================================================================================================");
        System.out.println("|                                            HÓA ĐƠN BÁN HÀNG                                          |");
        System.out.println("|                                                                 Ký hiệu :" + sign + "                     |");
        System.out.println("|                                                                 Số : " + number + "                           |");
        System.out.println("|                                        Ngày " + day + " tháng " + month + " năm " + year + "                                     |");
        System.out.println("========================================================================================================");
        company.output();
        System.out.println("========================================================================================================");
        customer.output();
        System.out.println("========================================================================================================");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-15s %-15s %-15s %-22s %-15s\n", "|Tên hàng hóa , dịch vụ", "|Đơn vị tính", "|Số lượng", "|Đơn giá", "|Thành tiền", "|");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        output();
        System.out.println("========================================================================================================");
        System.out.println("|           Người mua hàng                                                      Người bán hàng         |");
        System.out.println("|             Chữ ký số (nếu có)                                        (Chữ kí điện tử , Chữ ký số)   |");
        System.out.println("|                                                                                                      |");
        System.out.println("|                                                                                                      |");
        System.out.println("|                               (Cần kiểm tra , đối chiếu khi lập , nhận hóa đơn)                      |");
        System.out.println("========================================================================================================");

    }
}

