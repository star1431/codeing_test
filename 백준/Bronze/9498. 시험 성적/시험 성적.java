import java.util.Scanner;

public class Main {

    static String gradeLabel(int num) {
        if (num > 100) return "잘못된 점수";
        if(num >= 90) return "A";
        else if(num >= 80) return "B";
        else if(num >= 70) return "C";
        else if(num >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String grade =  gradeLabel(a);
        System.out.println(grade);
    }
}