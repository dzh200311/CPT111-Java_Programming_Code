package cw1week03;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = Integer.parseInt(kb.nextLine());
        int num2 = Integer.parseInt(kb.nextLine());
        int cha1 = 21 - num1;
        int cha2 = 21 - num2;
        if (num1 <= 21 && num2 <= 21){
            if (cha1 > cha2){
                System.out.println(num2);
            }else {
                System.out.println(num1);
            }

        }else if (num1 <= 21 && num2 > 21){
            System.out.println(num1);
        } else if (num1 > 21 && num2 <= 21) {
            System.out.println(num2);
        }else {
            System.out.println(-1);
        }
    }
}
