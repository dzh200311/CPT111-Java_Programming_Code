package cw2week02.lab2;

import java.util.Scanner;

public class lab3exercise2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("input the radius ? ");
        double radius = Double.parseDouble(kb.nextLine());
        double area = Math.PI * radius * radius;
//        double area2 = Math.PI * Math.pow(radius,2);
        System.out.println("the area is " + area);
        int roundarea = (int)Math.round(area);
        System.out.println("the rounded area is " + roundarea);
    }
}
