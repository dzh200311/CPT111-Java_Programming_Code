package Week12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
       List<String> list = Arrays.asList("a", "b", "a");
        System.out.println(evenAppend(list));
        List<String> list1 = Arrays.asList("a", "b", "b", "a", "a");
        System.out.println(evenAppend(list1));
    }

    public static String evenAppend(List<String> list){
        String rs = "";
        HashMap<String,Integer> countMap= new HashMap<>();
        int count;
        for (String key : list) {
            if (countMap.containsKey(key)) {
                count = countMap.get(key);
                countMap.put(key, count + 1);
            } else {
                countMap.put(key, 1);
            }
            if (countMap.get(key) % 2 == 0) {
                rs += key;
            }

        }

        return rs;
    }
}
