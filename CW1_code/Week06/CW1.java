package Week06;

public class CW1 {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("bread"));
        sandwichFillings("breadbread");
        //
        //编写一个Java方法，返回给定输入字符串中“面包”第一次和最后一次出现之间的字符串，如果没有两块面包，则返回字符串“无”。

    }

    public static String sandwichFillings(String input){
        String none = "none";
        int start = 0;
        int end = input.length() - 1;
        int breadIndex = 0;
        int breadIndex1 = 0;

        int found = input.indexOf("bread",start);
        int found1 = input.lastIndexOf("bread", end);

        if (found != -1 &&  found1 != -1 && found != found1) {
            if (found != -1){
                breadIndex = found;
            }

            if (found1 != -1){
                breadIndex1 = found1;
            }
            return input.substring(breadIndex+5,breadIndex1);
        }else return none;

    }


}
