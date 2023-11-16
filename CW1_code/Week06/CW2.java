package Week06;

public class CW2 {
    public static void main(String[] args) {
        int a = calcNetIncome("15000yuan bonus2000 rent -1000Y");
        System.out.println(a);
        //要创建房屋预算，您想找出您的净收入，即您的收入减去您的支出。
        //
        //编写一个Java方法，该方法采用输入字符串并计算收入减去费用。
        //
        //收入组成部分用数字表示；而您的支出是以减号“-”开头的数字。
        // 输入字符串可能包含小写字母和大写字母以及其他字符。
        //
        //请注意，Character.isDigit（char）测试字符是否是字符'0'，'1'，...，'9'之一。
        //另请回想一下，Integer.parseInt（string）将字符串转换为int。
        //
        //测试用例：
        //calcNetIncome("salary 15000yuan bonus2000 rent -1000Y") → 16000
        //calcNetIncome("25000 gross income, -200 water, electricity:-300") → 24500

    }

    public static int calcNetIncome(String input) {
        int beginNumberIndex = -1, endNumberIndex, outCome = 0;
        String input1 = " "+input;
        for (int i = 0, inputLength = input1.length(); i < inputLength; i++) {
            if (Character.isDigit(input1.charAt(i))) {
                if (beginNumberIndex >= 0) {
                    if (i + 1 < inputLength && Character.isDigit(input1.charAt(i + 1))) continue;
                    endNumberIndex = i;
                    int temp = Integer.parseInt(input1.substring(beginNumberIndex, endNumberIndex + 1));
                    if (beginNumberIndex - 1 >= 0){
                        String tempStr = input1.substring(beginNumberIndex-1, beginNumberIndex);
                        outCome += tempStr.equals("-") ? -temp : temp;
                    }
                    beginNumberIndex = -1;
                }else beginNumberIndex = i--;
            }
        }
        return outCome;
    }
}








