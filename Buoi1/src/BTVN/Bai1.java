package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int a2 = a;
        int b2 = b;
        int c2 = c;
        int c3 = c;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int bcnn = (a2 * b2) / a;
        while (c != 0) {
            int temp = a % c;
            a = c;
            c = temp;
        }
        System.out.print("UCLN la: ");
        System.out.println(a);
        int bcnn1 = bcnn;
        while (c2 != 0) {
            int temp = bcnn1 % c2;
            bcnn1 = c2;
            c2 = temp;
        }
        bcnn = (bcnn * c3) / bcnn1;
        System.out.print("BCNN la: ");
        System.out.println(bcnn);
    }
}