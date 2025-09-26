
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String curTime = sc.nextLine();
        int needMin = sc.nextInt();

        String[] curArr;
        curArr = curTime.split(" ");

        int curHour = Integer.parseInt(curArr[0]);
        int curMin = Integer.parseInt(curArr[1]);

        int sumMin = curMin + needMin;

        int resultHour = (curHour + (sumMin / 60)) % 24;
        int resultMin = sumMin % 60;


        System.out.println(resultHour  + " " + resultMin);
    }
}
