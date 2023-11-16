package Week13;

import java.util.*;

public class book {
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return this.title + " " + pageNum;
    }
}

class test{

    private static int countEmptyString(String[] arr){
        return countEmptyString(arr,0);
    }
    private static int countEmptyString(String[] arr, int start){
        int count = 0;
        if (start == arr.length ) return count;

        if (arr[start].isEmpty()){
            count = 1;
        }
        return count + countEmptyString(arr,start + 1);
    }

    /*private static int countEmptyString(String[] arr, int start) {
        // base case
        if (start == arr.length) {
            return 0;
        }

        // recursive step
        int count = 0;
        if (arr[start].equals("")) {
            count = 1;
        }
        return count + countEmptyString(arr, start + 1);
    }*/

    public static Set<String> collectCommon(Map<String, Integer> map, int n) {
        Set<String> commonKeys = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= n) {
                commonKeys.add(entry.getKey());
            }
        }
        return commonKeys;
    }

    public static int computeLetter(char c, String input) {
        if (input.length() == 0) { // base case
            return 0;
        } else if (input.charAt(0) == c) {
            return 1 + computeLetter(c, input.substring(1)); // recursive case
        } else {
            return computeLetter(c, input.substring(1)); // recursive case
        }
    }




    public static void main(String[] args) {
        String[] arr1 = {"123","","abc"};
        System.out.println(countEmptyString(arr1));
        String[] arr2 = {"","a"};
        System.out.println(countEmptyString(arr2));
        int x = (int)24.5;
        if (x >0);
        System.out.println("aaa");
        System.out.println(compute(3));
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 1);
        map.put("c", 10);
        Set<String> answer = collectCommon(map, 2);
        Set<String> expectedAnswer = new HashSet<>();
        expectedAnswer.add("a");
        expectedAnswer.add("c");
        System.out.println(answer.equals(expectedAnswer));
        String str1 = "Welcome";
        System.out.println(computeLetter('e', str1));

        String str2 = "Good Job";
        System.out.println(computeLetter('o', str2));
    }

    public static int compute(int n) {
        if (n == 0 || n == 1) return 0;
        if (n == 2) return 1;
        return compute(n-1) + compute(n-2) + compute(n-3);
    }
    public static boolean isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = 0;

        try {
            String in = sc.nextLine();
            number = Integer.parseInt(in);
        } catch (NumberFormatException e) {
            System.out.println("Non integer entered");
            System.out.println("Try again");
            return false;
        }

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                System.out.println("Non prime number entered");
                System.out.println("Try again");
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }
}
