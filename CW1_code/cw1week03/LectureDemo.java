package cw1week03;

import java.util.Scanner;

public class LectureDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        if (num < 0){
            num = -num;
        }
        System.out.println(num);
        System.out.println("____________________________________");

        String input2 = sc.nextLine();
        int num1 = Integer.parseInt(input2);
        if (num1 < 0){
            System.out.println("negative");
        } else if (num1 == 0) {
            System.out.println("Zero");

        }else {
            System.out.println("Positive");
        }


    }
}
