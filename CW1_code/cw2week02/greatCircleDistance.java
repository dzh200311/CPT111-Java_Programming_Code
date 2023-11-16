package cw2week02;

import java.util.Scanner;

public class greatCircleDistance {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x1= Double.parseDouble(kb.nextLine());
        double y1= Double.parseDouble(kb.nextLine());
        double x2= Double.parseDouble(kb.nextLine());
        double y2= Double.parseDouble(kb.nextLine());
        double x11 = Math.toRadians(x1);
        double y11 = Math.toRadians(y1);
        double x22 = Math.toRadians(x2);
        double y22 = Math.toRadians(y2);
        double r = 6371.0;
        double dist = 2 * r * Math.asin(Math.sqrt(Math.sin((x22 - x11) / 2) * Math.sin((x22 - x11) / 2) + Math.cos(x11) * Math.cos(x22) * Math.sin((y22 - y11) / 2) * Math.sin((y22 - y11) / 2)));
        System.out.println(dist + " kilometers");
    }
}
