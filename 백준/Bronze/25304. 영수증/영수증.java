
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalPay = sc.nextInt();
        int totalCnt = sc.nextInt();
        sc.nextLine();

        long checkPay = totalPay;
        for (int i = 1; i <= totalCnt; i++) {
            String[] items = sc.nextLine().split(" ");
            checkPay -= (Long.parseLong(items[0]) * Long.parseLong(items[1]));
        }

        if (checkPay == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
