package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = "";
        System.out.println("Nhap so can chuyen: ");
        int a = s.nextInt();
        System.out.println("Nhap co so can chuyen sang: ");
        int b = s.nextInt();
        while (a > 0) {
            if (b != 16) {
                st += Integer.toString(a % b);
                a /= b;
            } else {
                int c = 0;
                c += a % b;
                if (c >= 10) {
                    switch (c) {
                        case 10:
                            st += 'A';
                            break;
                        case 11:
                            st += 'B';
                            break;
                        case 12:
                            st += 'C';
                            break;
                        case 13:
                            st += 'D';
                            break;
                        case 14:
                            st += 'E';
                            break;
                        case 15:
                            st += 'F';
                            break;
                        default:
                            st += "";
                    }
                } else
                    st += Integer.toString(a % b);
                a /= b;
            }
        }
        for (int i = st.length() - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
    }
}
