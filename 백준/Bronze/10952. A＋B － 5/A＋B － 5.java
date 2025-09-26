import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] arr =  sc.nextLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(a == 0 && b == 0) break;

            System.out.println((a + b));
        }
    }
}
