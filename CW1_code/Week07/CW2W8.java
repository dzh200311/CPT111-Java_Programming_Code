package Week07;

public class CW2W8 {
    public static void main(String[] args) {
            System.out.println(computePQR("pxqy"));

    }

    public static double[] generateSeries(int n){
        double[] series = new double[n];
        int index = 0;
        for (int i = 1; i <= series.length; i++) {
            series[index] = i + ((double)1/(i*i));
            index++;
        }
        return series;
    }

    public static void printInts(double[] nums){
        System.out.print("[");
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i != nums.length - 1){
                    System.out.print(nums[i] + ", ");
                }else {
                    System.out.print(nums[i]);
                }
            }
        }
        System.out.print("]");
    }

    public static int computePQR(String str){
        int count = 0;
        int index = 0;
        String[] str1 = new String[((1+str.length())*str.length())/2];
        for(int i = 0; i < str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                str1[index] = str.substring(i,j);
                index++;
            }
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains("p") || str1[i].contains("q")) {
                count++;
            }
        }
        return count;

    }
}
