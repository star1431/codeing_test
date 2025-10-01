
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().trim().split(" ");

        boolean isAsc = false;
        for(int i = 0; i < arr.length; i++) {
            if((i + 1) != Integer.parseInt(arr[i])) {
                isAsc = false;
                break;
            }
            isAsc = true;
        }

        boolean isDesc = false;
        for(int i = arr.length; i > 0; i--) {
            if((i) != Integer.parseInt(arr[arr.length - i])) {
                isDesc = false;
                break;
            }
            isDesc = true;
        }

        if(isAsc) System.out.println("ascending");
        else if(isDesc) System.out.println("descending");
        else System.out.println("mixed");
    }
}
