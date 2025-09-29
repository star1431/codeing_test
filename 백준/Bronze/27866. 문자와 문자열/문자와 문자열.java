import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt = sc.nextInt();

        System.out.println(str.charAt(cnt - 1));
    }
}