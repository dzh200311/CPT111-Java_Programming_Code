package Week05;

import java.util.Scanner;

public class lecture {
    public static void main(String[] args) {
       int[] diceList = new int[4];
       diceList = generateDice(diceList);
       int[] diceList1 = new int[4];
       diceList1 = generateDice(diceList1);
       ////////////////////////////////////////////////////////////////
       int Total = getTotal(diceList);
        System.out.println("The total is " + Total);

        printInts(diceList);
        System.out.println();
        printInts(diceList1);

        int max = findMax(diceList);
        System.out.println("\nmax is " + max);

        int maxLocate = findMaxIndex(diceList);
        System.out.println("locate in " + maxLocate);

        ////////////////////////////////////////////////////////////////
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = Integer.parseInt(kb.nextLine());
        System.out.println(findIndices(diceList, choice));
        ////////////////////////////////////////////////////////////////
        System.out.println(compare(diceList, diceList1));
       int a = Integer.parseInt(Integer.toString((int)(Math.random()*3)));
    }
    public static int[] generateDice(int[] input){
        // Loop for length of array
        String a  = new String();

        for (int i = 0; i < input.length; i++) {
            double rand = ((Math.random() * 6) + 1);
            int dice = (int) rand;
            input[i] = dice;
            System.out.println("Result is " + dice);
        }
        //return the array
        return input;
    }
    public static int getTotal(int[] input){ // 注意返回值是int而不是int[]!
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
            System.out.println("this dice value is " + input[i]);
        }
        return total;
    }

    public static void printInts(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1){
                System.out.print(nums[i] + " , ");
            }else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");
    }

    public static int findMax(int[] input){
        //通过数组找最大值
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }

    public static int findMaxIndex(int[] input){
        //找到最大值的索引
        int max = input[0];
        int maxLocation = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max){
                max = input[i];
                maxLocation = i;
            }
        }
        return maxLocation;
    }

    public static int findIndices(int[] input, int data){
        //找到输入数的索引
        for (int i = 0; i < input.length; i++) {
            if(input[i] == data){
                return i;
            }
        }
        return -1;
    }

    public static boolean compare(int[] input1, int[] input2){
        //判断两个数组是否一样
        if(input1.length == input2.length){
            for (int i = 0; i < input1.length; i++) {
                if (input1[i] != input2[i]){
                    return false;
                }
            }
            return true;
        }else
            return false;
    }

}


