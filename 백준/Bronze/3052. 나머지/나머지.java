import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num % 42;
        }

        int[] arr2 = Arrays.stream(nums).distinct().toArray();

        System.out.println(arr2.length);

    }
}