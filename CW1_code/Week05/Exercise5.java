package Week05;

public class Exercise5 {
    public static void main(String[] args) {
        bandMatrix(50,20);

    }
    public static void bandMatrix(int n, int width){
        for(int i = 0; i < n; i++) { //行数
            for(int j = 0; j < n; j++) {
                if(Math.abs(i - j) <= width) {
                    System.out.print(". ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); //用来换行
        }
    }
}
