package cw1week03.lab3;


import java.util.Scanner;

public class harrcine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("输入锋利");
        int wind = Integer.parseInt(kb.nextLine());
        if ( wind >= 74){
            if (wind <= 95){
                System.out.println("class1");
            } else if (wind >= 96 && wind <= 110) {
                System.out.println("class2");
            } else if (wind >= 111 && wind <= 130) {
                System.out.println("class3");
            }else if (wind >= 131 && wind <= 150) {
                System.out.println("class4");
            }else if (wind >= 151 && wind <= 155) {
                System.out.println("class5");
            } else if (wind >= 156) {
                System.out.println("class6");
            }

        }else{
            System.out.println("not a typhoon");
        }
    }
}
