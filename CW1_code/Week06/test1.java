package Week06;


public class test1 {


    public static void main(String[] args) {

        char b = 'b';
        System.out.println( "" + b);

        System.out.println(11 / 3.0);
        System.out.println(19 / 5);
        System.out.println(14 / 5);
        System.out.println(16 / 5.0);
        System.out.println(19.0 / 5);


        System.out.println(14.0 / 5.0);
        System.out.println(Math.pow(5,0.5));
        System.out.println(Math.sqrt(5));
        int i = 0;
        int[] a= {1,2,3,4,5};
        while (i < a.length){
            System.out.println(a[i]);
            i++;
        }
        double[] a1 = {1,2,3,4,5};
        double[] b1 = {1,2,0,0,0};
        a1 = b1;
        System.out.println(a1);
        System.out.println(b1);
        int m = 12;
        String[] months = {
                "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        System.out.println(months[m]);
        System.out.println("  Winter is coming! :o~  ".trim());
        System.out.println(" \t Good\n Luck \n ".trim());
        int x = 3;
        int y = 2;
        System.out.println(x/y);



    }
}

