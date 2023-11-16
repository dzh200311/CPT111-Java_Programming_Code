package Week12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Erick.Purwanto
 */
public class Lecture12SetDemo {
    
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);        
        for (String string : set) {
            System.out.println(string);
        }
        System.out.println(set.contains("D"));

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[] {1, 3}));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 5, 4));
        
        set1.addAll(set2);
        System.out.println("set1 = set1 ∪ set2 = " + set1);
        
        System.out.println(set1.containsAll(set2));
        
        Set<Integer> intersectionSet = new HashSet<>(set1);
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(Arrays.asList(new Integer[] {1, 5, 6, 7}));
        intersectionSet.retainAll(set3);
        System.out.println("set1 ∩ set3 = " + intersectionSet);
        
        Set<Integer> set4 = new HashSet<>();
        set4.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
        Set<Integer> set5 = new HashSet<>();
        set5.addAll(Arrays.asList(new Integer[] {2, 5}));        
        
        Set<Integer> setDifference = new HashSet<>(set4);
        setDifference.removeAll(set5);
        System.out.println("set4 \\ set5 = " + setDifference);
        
        setDifference.remove(1);
        System.out.println(setDifference);        
        
        
    }
    
}
