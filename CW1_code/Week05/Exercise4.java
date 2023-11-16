package Week05;

public class Exercise4 {
    public static void main(String[] args) {
        int[] nums = arithSeries(10);
        printInts(nums);

    }

    public static void printInts(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1){
                System.out.print(nums[i] + ", ");
            }else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");
    }

    public static int[] arithSeries(int n){
        int count = n*(n + 1)/2;
        int index = 0;
        int[] series = new int[count];
        for (int i = 1; i <= n; i++) { //第一次循环一次 第二次循环两次
            for (int j = 1; j <= i; j++) {
                series[index] = j ;
                index = index + 1;
            }
        }
        return series;
    }
}
