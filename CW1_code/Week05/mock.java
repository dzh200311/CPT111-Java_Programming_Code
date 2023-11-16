package Week05;

public class mock {
    public static void main(String[] args) {
        boolean n = isMultFiveEleven(110);
        System.out.println(n);

    }
    public static boolean isMultFiveEleven (int n){
        boolean a ;
        if (n%5==0 & n%11==0){
            a = true;
        }else{
            a = false;
        }
        return a;
    }
}
