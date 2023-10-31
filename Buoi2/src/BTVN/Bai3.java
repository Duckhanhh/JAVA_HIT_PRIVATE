package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.printf("%d ", letterCount);
        System.out.printf("%d ", digitCount);
        System.out.printf("%d", specialCharCount);
    }
}
