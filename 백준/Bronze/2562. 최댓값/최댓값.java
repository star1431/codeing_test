import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numArr = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            numArr.add(num);
        }

        int maxNum = Collections.max(numArr);
        int maxPos = numArr.indexOf(maxNum) + 1;

        System.out.println(maxNum + "\n" + maxPos);
    }
}