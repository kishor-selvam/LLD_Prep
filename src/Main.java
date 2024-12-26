import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 1);
        map.put(4, 2);
        map.put(1, 1);
        System.out.println(map.get(4));
    }
}