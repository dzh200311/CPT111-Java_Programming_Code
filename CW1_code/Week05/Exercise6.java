package Week05;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 100, 200, 300, 7};
        int[] nums = evenOddSwap1(arr);
        printInts(nums);
        System.out.println();
        System.out.println(Arrays.toString(nums));




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

    public static int[] evenOddSwap(int[] nums) {
        int n = nums.length;
        int[] flag = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (flag[i] == 1)
                    continue;
                if ((nums[i] + nums[j]) % 2 == 1) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    flag[i] = flag[j] = 1;

                }

            }

        }
        return nums;
    }
    public static int[] evenOddSwap1(int[] nums) {

        int[] result = new int[nums.length];

        int even = 0, odd = 0;

        for (int i = 0; i < nums.length/2; i++) {
            while (nums[even] % 2 != 0)
                even++;
            while (nums[odd] % 2 != 1)
                odd++;
            result[odd] = nums[even];
            result[even] = nums[odd];
            odd++;
            even++;
        }

        return result;
    }
}
