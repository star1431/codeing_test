import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr1 = sc.nextLine().split(" ");

        // int leng = Integer.parseInt(strArr1[0]);
        int pointNum = Integer.parseInt(strArr1[1]);

        String[] strArr2 = sc.nextLine().split(" ");

        List<Integer> result = new ArrayList<>();
        for (String item : strArr2) {
            if(pointNum > Integer.parseInt(item)) result.add(Integer.parseInt(item));
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if(result.size() - 1 > i) System.out.print(" ");
        }
        System.out.println();

    }
}
