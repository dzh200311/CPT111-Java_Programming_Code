package cw1week03;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = Integer.parseInt(kb.nextLine());
        int b = Integer.parseInt(kb.nextLine());
        int c = Integer.parseInt(kb.nextLine());
        int r1 = a * a + b * b - c * c;
        int r2 = a * a + c * c - b * b;
        int r3 = b * b + c * c - a * a;
        boolean bool;
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            if (r1 == 0 || r2 == 0 || r3 == 0) {
                bool = true;
                System.out.println(bool);
            } else {
                bool = false;
                System.out.println(bool);
            }
        } else {
            bool = false;
            System.out.println(bool);


        }
    }
}
