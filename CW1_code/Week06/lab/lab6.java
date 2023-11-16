package Week06.lab;

public class lab6 {
    public static void main(String[] args) {
        System.out.println(repeatString("abc",3));
        System.out.println(checkQuestion("?123?"));
        printAllNames("instructor name = *Teng* and name = *Erick*");
        System.out.println(isPalindrome("arra1"));
        System.out.println(checkNumbership("E-123-456-23A"));

    }

    public static String repeatString(String input, int num){
        String output = "";
        for (int i = 0; i < num; i++) {
            output += input;
        }
        return output;
    }

    public static int checkQuestion(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            String input1 = input.substring(i, i + 1);
            if (input1.equals("?")){
                count++;
            }
        }
        return count;
    }

    public static void printAllNames(String names){
        int start = 0;
        while(true){
            int found = names.indexOf("name = *",start);
            if (found != -1){
                String name1 =  names.substring(found + 8,names.indexOf("*",found + 8));
                System.out.println(name1);
            }
            if(found == -1){
                break; // found none, need to stop looping
            }
            start = found + 8; // move start up for next iteration （实测加5以下好像都可）
        }
    }

    public static boolean isPalindrome(String input){
        String Palindrome = "";
        for (int i = input.length()-1; i >=0; i--) {
            Palindrome += input.charAt(i);
        }
        if (Palindrome.equals(input)){
            return true;
        }else return false;
    }

    public static boolean checkNumbership(String input){
        String input1 = input.toUpperCase();

        if (input1.length() == 13){
            String firstHyphen = input1.substring(1,2);
            String secondHyphen = input1.substring(5,6);
            String thirdHyphen = input1.substring(9,10);
            if (firstHyphen.equals("-") && secondHyphen.equals("-") && thirdHyphen.equals("-")){
                String firstLetter = input1.substring(0,1);
                if (firstLetter.equals("A") || firstLetter.equals("B")|| firstLetter.equals("C")|| firstLetter.equals("D")){
                    String secondBlock = input1.substring(2,5);
                    for (int i = 0; i < secondBlock.length(); i++) {
                        if(!Character.isDigit(secondBlock.charAt(i))){
                            return false;
                        }
                    }
                    String thirdBlock = input1.substring(6,9);
                    for (int i = 0; i < thirdBlock.length(); i++) {
                        if(!Character.isDigit(thirdBlock.charAt(i))){
                            return false;
                        }
                    }
                    String finalBlock = input1.substring(10);
                    if (Character.isDigit(finalBlock.charAt(0)) && Character.isDigit(finalBlock.charAt(1))){
                        if (finalBlock.charAt(2) >= 65 && finalBlock.charAt(2) <= 84){
                            return true;
                        }else return false;
                    }else return false;
                }else return false;
            }else return false;


        }else return false;
    }
}
