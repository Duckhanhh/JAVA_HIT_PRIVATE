package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        char c;
        a = s.nextInt();
        c = s.next().charAt(0);
        b = s.nextInt();
        if (c == '+') {
            System.out.print("Tong hai so: " + (a + b));
        }
        if (c == '-') {
            System.out.print("Hieu hai so: " + (a - b));
        }
        if (c == '*') {
            System.out.print("Tich hai so: " + (a * b));
        }
        if (c == '/') {
            System.out.print("Thuong hai so: " + (a / b));
        }
    }

}
