import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = 0, b = 0 , c = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0) break;

            int powA =  0, powB = 0, powC = 0;
            powA = (int) Math.pow(a, 2);
            powB = (int) Math.pow(b, 2);
            powC = (int) Math.pow(c, 2);

            int maxNum = Math.max(powA, Math.max(powB, powC));
            String result = "";
            
            if( powA + powB + powC - maxNum*2 == 0) result = "right";
            else result = "wrong";

            System.out.println(result);
        }
    }
}
