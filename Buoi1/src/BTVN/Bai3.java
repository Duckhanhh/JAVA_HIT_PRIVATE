package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = 1;
        while (n != 0) {
            t *= n % 10;
            n /= 10;
        }
        System.out.println(t);
    }
}
