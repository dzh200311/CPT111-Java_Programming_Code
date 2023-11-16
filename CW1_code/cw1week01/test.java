package cw1week01;

public class test {
    public static void main(String[] args) {
        int fib0;
        int fib1 = 1;
        int fib2 = 1;
        while (fib2 < 1000 ){
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib0;
            System.out.println(fib0);
        }
    }
}
