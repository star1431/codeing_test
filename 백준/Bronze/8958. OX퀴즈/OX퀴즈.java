import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =  Integer.parseInt(sc.nextLine());

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for(int i = 0; i < t; i++) {
            String[] str = sc.nextLine().trim().split("");
            List<Integer> changes = Arrays.stream(str).map(item -> {
                if(item.equals("O")) return 1;
                else  return 0;
            }).collect(Collectors.toList());
            map.put(i, changes);
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> val = entry.getValue();
            for(int i = 0; i < val.size(); i++) {
                if(val.get(i) == 0 || i == 0) continue;
                if(val.get(i-1) != 0) val.set(i, val.get(i-1) + 1);
            }
            System.out.println(val.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
