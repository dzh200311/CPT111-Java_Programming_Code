package Week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Erick.Purwanto
 */


public class Lec11DemoList {

    public static int findMaxInt(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static List<Swordsman> readFile(String fileName) {
        File file = new File(fileName);
        List<Swordsman> list = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String name = input.nextLine();
                Swordsman swordsman = new Swordsman(name);
                list.add(swordsman);
            }
            input.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return list;
    }


    public static void main(String[] args) {
        List<Swordsman> output = readFile("src/Week11/data/text1.txt");
        System.out.println(output);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1, 3);
        System.out.println(list);
        list.set(2, 10);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        /*List<String> list = new ArrayList<>(); list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "X");
        list.set(2, "Y");
        System.out.println(list);*/

        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));

        Iterator<Integer> it = list.iterator();
        int ele = it.next();


       /* List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "X");
        list.set(2, "Y");
        System.out.println(list);  //[A, X, Y, C]*/


    }
}
