package Week05;

public class copyEven {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,4,4};
        int[]  nums1 = copyEven1(nums);
        printInts(nums1);

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
    public static int[] copyEven (int[] nums) {
        int[] tmp = new int[nums.length]; // 先建立一个和nums一样长的临时数组
        // int count = 0; //count用来记录要输出数组的长度---->不需要！
        int index = 0; //index大概就是数组的指针，指向那个要复制进去的位置
        for (int i = 1; i <= nums.length; i++) { //这个循环是用来找偶数位的数 并存储在tmp临时数组里 同时count和index计数增加
            if (i % 2 != 0) {
                tmp[index] = nums[i-1]; //因为数组索引是从0开始的，i是1开始循环的，所以要-1
                index += 1;
                //count += 1;
            }
        }
        int[] rs = new int[index];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = tmp[i];
        }

        return rs;
    }
   // tem = [0,0] [1,0] tem[2]
    //       0 1  2    tem[1]

    public static int[] copyEven1(int[] nums) {

        int n = nums.length;
        int[] copyArray = new int[(n+1)/2];

        for (int i = 0; i < n; i += 2) {
            copyArray[i/2] = nums[i];
        }
        return copyArray;
    }
}
