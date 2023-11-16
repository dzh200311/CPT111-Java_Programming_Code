package Week05;

public class diamd {
    public static void main(String[] args) {
    diamond1(5);

    }
    public static void diamond1(int n) {
        int m = n / 2;
        for (int i = -m; i <= m; i++) {
            for (int j = -m; j <= m; j++) {
                if (Math.abs(i) + Math.abs(j) <= m)
                    System.out.print("* ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
    public static void diamond(int n){ //以n=5为例
        //上菱形
        for (int i = 0; i < n/2+1; i++) { //上半行数
            for (int j = i+1; j <=n/2; j++) { //i=0循环两次 i=1第二次循环一次 i=3循环0次
                System.out.print(". ");
            }
            for (int j = 1; j <= i+1; j++) { //右半部分：i=0 循环一次 i=1循环2次
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i+1; j <=n/2; j++) {
                System.out.print(". ");
            }
            System.out.println(); //换行

        }
        //下菱形
        for (int i = 0; i < n/2; i++) { //下半行数
            for (int j = 1; j <= i+1 ; j++) { //i=0循环一次 i=1循环2次
                System.out.print(". ");
            }
            for (int j = n/2-1; j >i; j--) {
                System.out.print("* ");
            }
            for (int j = n/2-1; j >= i; j--) {
                System.out.print("* ");
            }for (int j = 1; j <= i+1 ; j++) { //i=0循环一次 i=1循环2次
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
