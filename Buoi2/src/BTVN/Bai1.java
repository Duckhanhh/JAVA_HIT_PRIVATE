package BTVN;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0;
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        int maxFreqIndex = 0;
        for (int i = 1; i < n; i++) {
            if (freq[i] > freq[maxFreqIndex]) {
                maxFreqIndex = i;
            } else if (freq[i] == freq[maxFreqIndex] && arr[i] < arr[maxFreqIndex]) {
                maxFreqIndex = i;
            }
        }
        System.out.printf("%d ", arr[maxFreqIndex]);
        System.out.printf("%d", freq[maxFreqIndex]);
    }
}
