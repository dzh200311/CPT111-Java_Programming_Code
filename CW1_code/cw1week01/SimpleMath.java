/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1week01;

/**
 *
 * @author dengzihan
 */
public class SimpleMath {
    public static void main(String[] args){
        int num1 = 10, num2 = 3;
        double real1 = 10.0, real2 = 3.0;
        
        System.out.println("num1 + num2 = " + (num1 + num2)); //计算是从左往右的 若没有括号则输出结果为103
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("real1 + real2 = " + (real1 + real2));
        System.out.println("real1 / real2 = " + (real1 / real2));
    }
}
    