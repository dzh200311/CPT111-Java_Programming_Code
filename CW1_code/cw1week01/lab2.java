package cw1week01;

public class lab2 {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.print("hello");
        System.out.print("hello\n"); //注意 println表示单独输出一行 无ln则输出在一行
        // \n表示换行！ 同时若要输出注入"/"这类在语言中有定义的符号需在前面加\

        double num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        double solution = num1 + num2 / num3 - num4 + num5;
        System.out.println(num1 + "+" + num2 + "/" + num3 + "-" + num4 + "+" + num5 + "=" + solution);
        // 用这种方式来输出可以简化修改变量以及结果的过程
        double sol2 = num2 / num1;
        System.out.println(sol2);
    }
}
