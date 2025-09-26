import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lineCnt; i++) {
            String[] arr = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}
