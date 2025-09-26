
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            ) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] arr = br.readLine().split(" ");
                int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
                bw.write(sum + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}