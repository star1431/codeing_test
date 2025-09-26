

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int start = 'a';
        int end = 'z';
        int[] codes = new int[end - start + 1];
        Arrays.fill(codes, -1);

        for (int i = 0; i < str.length(); i++) {
            int cur = str.charAt(i);
            if(cur >= start && cur <= end) {
                if(codes[cur - start] != -1) continue;
                codes[cur - start] = i;
            }
        }

        for (int i = 0; i < codes.length; i++) {
            if(i < codes.length - 1) System.out.print(codes[i] + " ");
            else System.out.println(codes[i]);
        }
    }
}
