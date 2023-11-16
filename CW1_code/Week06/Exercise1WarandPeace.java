package Week06;

public class Exercise1WarandPeace {
    public static void main(String[] args) {
        String quote = "\"war peace peace war \"";
        System.out.println(WarAndPeace(quote));

    }
    public static boolean WarAndPeace(String text){
        int warIndex = 0;
        int peaceIndex = 0;

        if (text.contains("war") || text.contains("peace")) { // 要是都有进入
            int start1 = 0;
            int start2 = 0;
            while(true){
                int found = text.indexOf("war",start1);
                if (found != -1){
                    warIndex++;
                }
                if(found == -1){
                    break; // found none, need to stop looping
                }
                start1 = found + 3; // move start up for next iteration
            } //判断几个war
            while(true){
                int found = text.indexOf("peace",start2);
                if (found != -1){
                    peaceIndex++;
                }
                if(found == -1){
                    break; // found none, need to stop looping
                }
                start2 = found + 5; // move start up for next iteration
            } // 判断几个peace
            if (warIndex == 0 && peaceIndex == 0) {
                return true;
            }else return peaceIndex == warIndex;
        }else {
            return true;
        }


    }
}
