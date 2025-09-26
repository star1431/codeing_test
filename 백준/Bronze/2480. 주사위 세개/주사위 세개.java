
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] diceEyes = sc.nextLine().split(" ");

        int[] diceArr = new int[diceEyes.length];
        for(int i = 0; i < diceEyes.length; i++) {
            diceArr[i] = Integer.parseInt(diceEyes[i]);
        }

        int[] cntArr = new int[7];
        for(int item : diceArr) {
            cntArr[item]++;
        }

        int maxCnt = 0;
        int maxEye = 1;
        for(int i = 1; i <= 6; i++) {
            if (cntArr[i] >= maxCnt) {
                maxCnt = cntArr[i];
                maxEye = i;
            }
        }
        
        if(maxCnt == 3) System.out.println((10000 + (maxEye) * 1000));
        else if(maxCnt >= 2) System.out.println((1000 + (maxEye) * 100));
        else System.out.println((maxEye) * 100);
    }
}