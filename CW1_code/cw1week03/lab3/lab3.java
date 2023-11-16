package cw1week03.lab3;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("输入周几");
        int num = Integer.parseInt(kb.nextLine());
        if (num > 0 && num < 8){
            if (num == 1){
                System.out.println("monday");
            } else if (num == 2) {
                System.out.println("周二");
            } else if (num == 3) {
                System.out.println("周三");
            } else if (num == 4) {
                System.out.println("周四");
            } else if (num == 5) {
                System.out.println("Friday");
            } else if (num == 6) {
                System.out.println("saturday");
            } else if (num == 7) {
                System.out.println("Sunday");
            }

        }else {
            System.out.println("not valid");
        }
    }
}
