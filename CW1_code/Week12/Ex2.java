package Week12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alice", "bob", "apple", "banana");
        Map<String, String> map = sameFirstLetter(list);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        List<String> list1 = Arrays.asList("after", "all", "this", "time", "always");
        Map<String, String> map1 = sameFirstLetter1(list1);
        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }
    }

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String s : list) {
            String key = s.substring(0, 1);
            int index = 0;
            if (map.containsKey(key)) {
                String tmp = map.get(key);
                if (s.startsWith(key)) {
                    map.put(key, tmp + s + ",");
                }
            } else {
                map.put(key, s + ",");
            }
        }
        for (String key : map.keySet()) {
            String tmp = map.get(key);
            tmp = tmp.substring(0,tmp.length()-1);
            map.put(key, tmp);
        }
        return map;

    }
    public static Map<String, String> sameFirstLetter1(List<String> list) {
        Map<String, String> map = new HashMap<>();
        String appendWords;
        for (String word : list) {
            String firstLetter = word.substring(0, 1);
            if (!map.containsKey(firstLetter)) {
                map.put(firstLetter, word);
            }
            else {
                appendWords = map.get(firstLetter);
                map.put(firstLetter, appendWords + "," + word);
            }
        }
        return map;
    }
}
