import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int line1 = (a + b) % c;
        int line2 = ((a % c) + (b % c)) % c;
        int line3 = (a * b) % c;
        int line4 = ((a % c) * (b % c)) % c;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}
