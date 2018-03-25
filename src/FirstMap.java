import java.util.HashMap;
import java.util.Map;

public class FirstMap {
    public static void main(String[] args) {
        Map<Integer, String> mapExample = new HashMap<>();

        mapExample.put(13, "Ieva");
        mapExample.put(1, "Agne");
        mapExample.put(3, "Ugnius");
        mapExample.put(2, "Povilas");
        mapExample.put(9, "Ieva_pakartojam");

        for(Integer m: mapExample.keySet()) {
            System.out.println("key: " + m + "values:" + mapExample.get(m));
        }


    }
}
