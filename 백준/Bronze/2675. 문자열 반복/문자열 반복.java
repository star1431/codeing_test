import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];
        
        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            String str = sc.next();
            String newStr = "";

            for (int j = 0; j < str.length(); j++) {
                newStr += String.valueOf(str.charAt(j)).repeat(cnt);
            }
            strArr[i] = newStr;
        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}