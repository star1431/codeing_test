import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String[] arr = sc.nextLine().split(" ");
            int sum = Integer.parseInt(arr[0]) +  Integer.parseInt(arr[1]);
            System.out.printf("Case #%d: %d\n", i, sum);
        }
    }
}