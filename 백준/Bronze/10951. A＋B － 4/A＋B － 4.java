import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String str = br.readLine();
                if (str == null || (str.equals(" ") || str.isEmpty())) break;
                String[] arr = str.split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                sb.append((a + b)).append("\n");
            }

            if(!sb.isEmpty()) System.out.println(sb);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}