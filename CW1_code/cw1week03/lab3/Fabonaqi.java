package cw1week03.lab3;

import java.util.Scanner;

public class Fabonaqi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("plz input limit ");
        int limit = Integer.parseInt(kb.nextLine());
        if (limit < 1){
            return;
        }else {
            int first = 0;
            int second = 1;
            int third = first + second; // 1
            System.out.print(first + " "); // 0
            while (third < limit){
                System.out.print(third + " "); // 0 1 1 2
                third = first + second; // 1= 0 + 1    third = 2
                first = second; // = 1 = 1
                second = third; // = 1 = 2

            }
        }
        System.out.println();

    }
}
