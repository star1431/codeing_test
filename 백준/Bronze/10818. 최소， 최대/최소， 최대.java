import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leng = sc.nextInt();
        sc.nextLine();

        String[] strArr2 = sc.nextLine().split(" ");
        int[] arr = new int[leng];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr2[i]);
        }

        int minNum = arr[0], maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minNum) minNum = arr[i];
            if(arr[i] > maxNum) maxNum = arr[i];
        }

        System.out.println(minNum + " " + maxNum);
    }
}