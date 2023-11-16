package cw2week02.lab2;

import java.sql.SQLOutput;

public class lab3 {
    public static void main(String[] args) {
        double pi = Math.PI;
        double sqrt5 = Math.sqrt(5);
        System.out.println("the pi is " + pi);
        System.out.println("sqrt5 is " + sqrt5);
        int randomInt = 2 + (int)(Math.random() * (5 - 2 + 1)); //（5-2+1）= 4 [0.0 , 4.0)
        // 在区间2到5取随机整数（min到max取）
        // 公式 randomInteger = min + (int)(Math.random() * (max - min + 1))
        System.out.println("the random int is " + randomInt);
    }
}
