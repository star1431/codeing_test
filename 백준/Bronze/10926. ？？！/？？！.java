import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        if(input.length() > 50) System.out.println("50자넘음");
        else System.out.println(input.toLowerCase() + "??!");
        
        sc.close();
    }
}