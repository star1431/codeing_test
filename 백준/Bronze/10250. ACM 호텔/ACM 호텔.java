import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int a, b;
            if(n % h == 0) a = h;
            else a = n % h;
            b = (n - 1)/h + 1;
            
            if (b > w) arr[i] = "error:넘침";
            else arr[i] = String.format("%d%02d", a, b);
        }

        for(String item : arr) {
            System.out.println(item);
        }
    }
}
