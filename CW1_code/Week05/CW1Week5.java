package Week05;

public class CW1Week5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        reverseInts(nums);
        printInts(nums);

    }
    public static void printInts(int[] nums){
        System.out.print("[");
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i != nums.length - 1){
                    System.out.print(nums[i] + ", ");
                }else {
                    System.out.print(nums[i]);
                }
            }
        }
        System.out.print("]");
    }
    // --->
    // {1 2 3 4 5}
    //  0 1 2 3 4     n = 5; 5/2 = 2;
    //  @ # | # @     交换，因为是整除，所以循环次数为整除的次数
    //__________________________________
    // --->
    // {1 2 3 4}
    //  0 1 2 3     n = 4; n/2 = 4/2 = 2;
    //  @ # # @    交换
    public static void reverseInts(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n/2; i++) {
            int tmp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = tmp;

        }
    }
}
