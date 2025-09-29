import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] codes  = sc.nextLine().trim().split(" ");

        int sum = 0;
        for(String item : codes){
            sum += Math.pow(Integer.parseInt(item), 2);
        }

        System.out.println((sum % 10));

    }
}