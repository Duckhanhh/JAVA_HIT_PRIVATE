package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap so luong truy van: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.printf("Nhap vi tri L va R cho truy van thu %d: ", i + 1);
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int sum = 0;
            for (int j = l; j <= r; j++) {
                sum += arr[j];
            }
            System.out.printf("%d \n", sum);
        }
    }
}
