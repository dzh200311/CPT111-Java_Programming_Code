package Week12;

/**
 *
 * @author Erick.Purwanto
 */
public class Lecture12Demo {
    
    public static int oneSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static int twoSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    count++;
                }                
            }            
        }
        return count;
    }
    
    public static int threeSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    /*if (arr[i] + arr[j] == 0) {
                        count++;
                    }*/
                    count++;
                }
            }
        }
        return count;
    }
    
    // overload with target t
    public static int threeSum(int[] arr, int t) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] == t) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        int[] array = new int[2000];
        int min = -1000;
        int max = 1000;

        
        long start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int)(Math.random() * (max - min + 1));
        }
        int count = threeSum(array);

        
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
        System.out.println(count);

        int t  = 100;
        for (int i = 0; i < t; i++) {
            System.out.println(threeSum(array));
        }
        
    }
    
}
