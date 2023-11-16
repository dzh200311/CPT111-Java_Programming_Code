package cw1week03.lab3;

import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("input the N");
        int n = Integer.parseInt(kb.nextLine());
        int n2 = 1;
        while (n2 < n){
            n2 = n2 * 2;
            System.out.println("value is " + n2 / 2);

        }
    }
}
