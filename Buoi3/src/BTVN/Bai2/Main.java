package BTVN.Bai2;

import java.util.Scanner;

public class Main {
    public static int toInt(String s) {
        int res = 0, h = 0, m = 0;
        if (s.length() <= 4) {
            h = 60 * ((int) s.charAt(0) - 48) + ((int) s.charAt(2) - 48) * 10 + ((int) s.charAt(3) - 48);
        } else {
            h = 600 * ((int) s.charAt(0) - 48) + 60 * ((int) s.charAt(1) - 48) + ((int) s.charAt(3) - 48) * 10 + ((int) s.charAt(4) - 48);
        }
        return h;
    }

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("MENU");
        System.out.println("1.Input new subject");
        System.out.println("2.Show subject list");
        System.out.println("3.Sort by Time end");
        System.out.println("4.Choose subject");
        System.out.println("5.Exit");
        System.out.print("Enter your choose(1-5): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject[] s = new Subject[100005];
        boolean go = true;
        int n = 0;
        while (go) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1) {
                n++;
                Subject subject = new Subject();
                subject.input();
                s[n] = subject;
            } else if (choose == 2) {
                System.out.printf("%-3s%-15s%-15s%s\n", "Id", "Subject name", "Student count", "Time Start - end");
                for (int i = 1; i <= n; i++) s[i].display();
            } else if (choose == 3) {
                for (int i = 1; i < n; i++)
                    for (int j = i + 1; j <= n; j++)
                        if (s[i].timeEnd() > s[j].timeEnd()) {
                            Subject subject = s[i];
                            s[i] = s[j];
                            s[j] = subject;
                        }
            } else if (choose == 4) {
                System.out.print("Input time start: ");
                String start = sc.nextLine();
                System.out.print("Input time end: ");
                String end = sc.nextLine();
                int st = toInt(start);
                int en = toInt(end);
                for (int i = 1; i < n; i++)
                    for (int j = i + 1; j <= n; j++)
                        if (s[i].timeEnd() > s[j].timeEnd()) {
                            Subject subject = s[i];
                            s[i] = s[j];
                            s[j] = subject;
                        }
                System.out.printf("%-3s%-15s%-15s%s\n", "Id", "Subject name", "Student count", "Time Start - end");
                for (int i = 1; i <= n; i++)
                    if (st < s[i].timeStart() && en > s[i].timeEnd()) {
                        s[i].display();
                        st = s[i].timeEnd();
                    }
            } else if (choose == 5) {
                System.out.println("Exited!");
                go = false;
            }
        }
    }
}