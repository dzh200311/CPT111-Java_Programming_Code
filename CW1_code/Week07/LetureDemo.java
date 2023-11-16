package Week07;

import java.util.Scanner;

public class LetureDemo {

    public static void main(String[] args) {
        Person p1 = new Person("John", "M", "London", "2020-02-20", 007);
        System.out.println(p1.getName());
        System.out.println(p1.getCity());
        Scanner kb = new Scanner(System.in);
        Person p2 = new Person();
        System.out.println("———————输入姓名—————————");
        //p2.name = kb.nextLine();
        p2.setName(kb.nextLine() );
        System.out.println(p2.getName());


       /* static 关键字属于类，而不是类的实例。

        静态变量
        static 可以用于节省内存，所有实例化的对象共用一块静态变量的内存，该静态变量可以被任意对象覆写（有点像全局变量）

        静态方法
        静态方法不能直接使用非静态数据成员或调用非静态方法，this 和 super 两个关键字不能在静态上下文中使用。（因为static 关键字属于类，而不是类的实例。）
————————————————
        版权声明：本文为CSDN博主「SP FA」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/SP_FA/article/details/120187578*/

    }
}
