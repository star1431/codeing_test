import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String[] nums = sc.next().split("");

        int sum = 0;
        for(String num : nums) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}