package Test.Bai1;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        scanner.close();

        boolean ketQua = kiemTraChuoiNgoac(chuoi);

        if (ketQua) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean kiemTraChuoiNgoac(String chuoi) {
        Stack<Character> stack = new Stack<>();

        for (char kyTu : chuoi.toCharArray()) {
            if (kyTu == '(' || kyTu == '[' || kyTu == '{') {
                stack.push(kyTu);
            } else if (kyTu == ')' || kyTu == ']' || kyTu == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char dauMoNgoac = stack.pop();

                if ((kyTu == ')' && dauMoNgoac != '(') || (kyTu == ']' && dauMoNgoac != '[')
                        || (kyTu == '}' && dauMoNgoac != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}