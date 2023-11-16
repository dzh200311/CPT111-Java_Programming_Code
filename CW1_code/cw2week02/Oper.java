package cw2week02;

import java.util.Scanner; // remember using package

public class Oper {
    public static void main(String[] args) {
        //operators运算
            //part1.mod-%
            //可以用来判断奇偶性
            int num1 = 3;
            int num2 = 2;
            int result = num1 % num2;
            System.out.println(result); // 1
            //找到个位（十位）数
            int num3 = 456;
            int ge = num3 % 10;
            System.out.println(ge); // 6
        //-----------------------------------
            //Part.2 unary Operators - have only 1 operand
        int a;
        a = 41;
        a++;
        System.out.println("a = " + a);  // 42
        a--;
        System.out.println("a = " + a);  // 41

        // a++ 和 ++a不大一样

        int k = 3;
        int p = 5;
        //k  3    4                                            5                                            4
        //p  5                                                                                      4   3       4
        //rs null 3(++在后先用再加；3进入rs运算中 4记录在第2步) + 5（++在前先加再用，加完记录在第三部） - 4 + 4 - 5 + 4 + 2
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k); // 4
        System.out.println(p); // 4
        System.out.println(rs); // 9

        // 不过好像可以忽略？就用a++就行了

//        We also have: a += 2;
//        a = a + 2; a -= 3;
//        a *= 3;
//        a = a * 3;
            //-----------------------------------
            //Part.3 Maths.
        int num5 = 5;
        double root = Math.sqrt(num5);
        System.out.println(root);

        int num6 = 9;
        int max = Math.max(num5,num6); //找最大值
        System.out.println(max);
                    // 重要的math公式
        /*Math.hypot(x,y); --- sqrt(x^2 + y^2);
        Math.pow(x,y); ----- x^y;
        Math.atan(double a)----- arctan(a), a = y/x;接受一个数据，但是无法考虑所有象限，因为是÷
        Math.atan2(double y, double x)----- arctan,接受两个数据*/
        //-----------------------------------

                //random number 生成随机数
        // Math.random() will generate a pseudo-random number
        double rand = Math.random(); // [0.0 ,1,0) is the domain
        System.out.println(rand);
        //if need a different range? -- 0.0-5.0 not including 5.0
        double rand2 = Math.random() * 5;
        System.out.println(rand2);
        //-----------------------------------
                // Scanner
        // 创建 Scanner object
        Scanner kb = new Scanner(System.in);
        // then use it to receive and  store an input
        System.out.println("Input name");
        String next = kb.nextLine(); //next 和 nextLine 的区别？
        //then can be stored as a var and used
        System.out.println("Name is " + next);

        //-----------------------------------
                // Cast and conversion
        //例如掷骰子 如果只是生成随机数的话那会存在小数
        double randice = Math.floor(Math.random()*6 + 1); //floor 和 round 区别？
                                        //floor，地板 向下取整 向下取整的时候，正数，则取其整数部位，抹除小数部位；负数，则取其整数加一；
                                        //round，四周 四舍五入
                                        //ceil,  天花板 向上 向上取整的时候，正数，则直接将当前整数加一；负数，则将整数后面的数据抹除；整数，则不变。
        System.out.println(randice); //1.0

        //-----------------------------------
        //类型转换
        int randice1 = (int) randice;
        System.out.println(randice1); //1
//        int randice = (int)(Math.random()*6 +1); is also good
        // casting not "round" numbers!


        // using wrapper classes
        // to see example, see CMYK files and WhatDay files
        //-----------------------------------
        // 把字符转换成数据
        String s = "999";
        int res = Integer.parseInt(s); //转成数值
        String out = Integer.toString(res); //转回字符
        System.out.println(res);
        System.out.println(out);
    }
}
