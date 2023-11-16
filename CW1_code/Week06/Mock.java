package Week06;

public class Mock {
    public static void main(String[] args) {
        int[] arr = new int[9];
        boolean checkNum = arr.length <= 10 ? true : false;
        System.out.println(countABCD("草泥马的ABCDabcabcdabcd"));
    }

    public static int countABCD(String input) {
        int start = 0;
        int count = 0;
        String input1 = input.toLowerCase();
        while(true){
            int found = input1.indexOf("abcd",start);
            if (found != -1){
                count++;
            }
            if(found == -1){
                break;
            }
            start = found + 4;
        }
        return count;
    }
}
