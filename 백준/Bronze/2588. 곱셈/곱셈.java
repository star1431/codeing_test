import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();

        String[] strArr;
        strArr = b.split("");

        List<Integer> list = new ArrayList<>();

        for (int i = (strArr.length - 1); i >= 0; i--) {
            int num = a * Integer.parseInt(strArr[i]);
            System.out.println(num);

            if(i == 0) System.out.println((a * Integer.parseInt(b)));
        }
    }
}