import java.util.Scanner;

public class Main {
    static double calc(String k, double a, double b) {
        return switch (k) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            default -> 0.0;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println((int) calc("+", a, b));
        System.out.println((int) calc("-", a, b));
        System.out.println((int) calc("*", a, b));
        System.out.println((int) calc("/", a, b));
        System.out.println((int) calc("%", a, b));
        sc.close();
    }
}
