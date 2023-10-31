package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
