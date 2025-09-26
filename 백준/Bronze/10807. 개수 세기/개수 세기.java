import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strArr = sc.nextLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int a = sc.nextInt();
        int cnt = 0;
        for (int item : arr) {
            if(item == a) cnt++;
        }
        System.out.println(cnt);

    }
}