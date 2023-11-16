package cw1week03;

import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        int count = 1;
        while (n != 1){
            if (n % 2 != 0){
                n = n * 3 + 1;
                count = count + 1;
            }else {
                n /= 2;
                count = count + 1;
            }

        }
        System.out.println(count);
    }
}
