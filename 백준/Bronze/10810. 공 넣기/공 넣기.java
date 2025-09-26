
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNum = sc.nextInt();
        int lineNum = sc.nextInt();

        int[] cnt = new int[maxNum];
        for (int i = 0; i < lineNum; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();

            // 1 ~ 2 -> 0 ~ 1
            for (int j = (start - 1); j < end; j++) {
                cnt[j] = num;
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if(i < cnt.length - 1) System.out.print(cnt[i] + " ");
            else System.out.println(cnt[i]);
        }
    }
}