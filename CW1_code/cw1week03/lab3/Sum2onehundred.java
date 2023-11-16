package cw1week03.lab3;

import java.util.Scanner;

public class Sum2onehundred {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;

        int count = 0;
        while (sum < 100){
            System.out.println("type value");
            String n = kb.nextLine();
            int num = Integer.parseInt(n);
                sum = sum + num;
                count = count + 1;
                System.out.println("now the number is "+ sum);
            }
        System.out.println("——————————————————————————————————");
        System.out.println("the final num is "+ sum);
        System.out.println("the count is " + count);

        }


    }


