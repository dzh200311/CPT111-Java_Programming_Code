package cw2week02;

import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine()；----既然要求是小数就不能是字符串
        double x = Double.parseDouble(kb.nextLine());
        // 数字类型的String字符串转换为浮点数通常采用parseDouble()和valueOf()方法
        double y = Double.parseDouble(kb.nextLine());
        double r = Math.sqrt(x*x + y*y);
        //double theta = Math.atan(y/x);
        //这样是不行的，因为在二三象限会导致y/x的数据错误（try -1.0 -1.0/ -1.0 1.0) not think all quadrants
        /*Math.atan的弊端：

        tan度=X/Y;

        坐标轴有四个像限：

        X/Y=-X/-Y

                -X/Y=X/Y

        这种情况会导致一个tan度对应两个角度的情况*/
//        使用Math.atan2,可以求出俩边之间夹角的度数并且判断该度数对应的是哪个夹角
//
//        Math.atan2接收两个参数，Math.atan接受的是一个参数【度数】
        double theta = Math.atan2(y , x);
        System.out.println("r =" + r);
        System.out.println("theta = " + theta);
        /*System.out.println("expected r = " + Math.sqrt(2));
        System.out.println("expected theta = " + 3*Math.PI/4);*/
    }
}
