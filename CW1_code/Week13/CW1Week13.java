package Week13;

public class CW1Week13 {
    // Exercise #13.1
    public static int numXY(String input) {
        int count = 0;
        int index;
        // base case
        if (!input.contains("XY")) {
            return count;
        }else {
            index = input.indexOf("XY");
            count++;
        }
        input = input.substring(index+2);
        // recursive step
        return count + numXY(input);
    }


    // Exercise #13.2
    public static String remDup(String input) {
        if ( input.length() <= 1 ) return input;

        if( input.substring(1,2).equals(input.substring(0,1)) ) return remDup(input.substring(1));

        else return input.substring(0,1) + remDup(input.substring(1));
    }


    // Exercise #13.3
    public static String sepStar(String input) {

        // base case
        if ( input.length() <= 1 ) return input;
        // recursive step
        if( input.substring(1,2).equals(input.substring(0,1)) ){
            input = input.substring(0,1) + "*" + input.substring(1);
            return sepStar(input.substring(0));
        }

        else return input.substring(0,1) + sepStar(input.substring(1));



    }


    // CW1 #13.1 Recursive Smallest Integer
    // Appear in FINAL EXAM 2019

    /*public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    private static int smallest(int[] array, int start) {

        // base case
        int min = array[start];
        if (start == array.length-1){
            return min;
        }
        // recursive step
        else return  Math.min(array[start], smallest(array,start + 1));
    }*/
    public static int smallest(int[] arr, int start, int end) {
        int smallest;
        if (start == end) {
            return arr[start];
        } else {
            smallest = smallest(arr, start, end - 1);
            if (arr[end] < smallest) {
                return arr[end];
            } else {
                return smallest;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(numXY("AAXYAA"));       // 1
        System.out.println(numXY("AXYBXYAA"));     // 2

        System.out.println(remDup("hello"));       // helo
        System.out.println(remDup("abbbcd"));      // abcd

        System.out.println(sepStar("hello"));      // hel*lo
        System.out.println(sepStar("uuvxxyzzz"));  // u*uvx*xyz*z*z

        int[] arr1 = {10, 5, 7, 9};
        System.out.println(smallest(arr1,0,3));        // 5

        // add your own test cases :
        int[] arr2 = {1,3,2,4,5};
        System.out.println(smallest(arr2,0,4));




    }
}
