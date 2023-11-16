package Week06;

public class Exercise2 {
    public static void main(String[] args) {
        String id = "1000001";
        System.out.println(isValidID(id));
        Exercise1WarandPeace.WarAndPeace("a");
        //您为制造商工作，该制造商使用唯一的ID字符串制作产品来编码产品的属性。
        //
        //ID的最后一个字符是一个复选数字，这是ID中出现的数字“0-9”的总和，忽略所有其他字符，模11，如果其余字符为10，则使用字符“X”。
        //编写一个Java方法，该方法采用ID字符串并确定它是否是有效的ID号。
        //
        //请注意，ID字符串的长度至少为5，使用大写或小写字母，以及破折号'-'。
        //
        //请注意，Character.isDigit（char）测试字符是否是字符'0'，'1'，...，'9'之一。
        // 另请回想一下，Integer.parseInt（string）将字符串转换为int。

    }

    public static boolean isValidId(String id) {
        //先找出所有的0-9整数 然后求和 同时对11取余 然后和最后一位比较
        if (id.length() >= 5) {
            int sum = 0;
            char[] chars = id.toCharArray();
            for (int i = 0; i < id.length() - 1; i++) {
                if (Character.isDigit(chars[i])){
                    sum = sum + Integer.parseInt(String.valueOf(chars[i]));
                }
            }
            int rs1 = sum % 11;
            String lastWord = id.substring(id.length() - 1);

            if (Character.isDigit(chars[id.length() - 1])){ //如果最后一个是数
                int lastIndex = Integer.parseInt(lastWord);
                return lastIndex == rs1;
            }else{
                return rs1 == 10 && lastWord.equals("X");
            }
        }else return false;




    }

    public static boolean isValidID(String id) {
        int n = id.length();
        int sum = 0;
        if (n < 5) {
            return false;
        }
        for (int i = 0; i < n - 1; i++) {
            char c = id.charAt(i);
            boolean b = Character.isDigit(c);
            if (b == true) {
                int a = Integer.parseInt(String.valueOf(id.charAt(i)));
                sum = sum + a;
            } else if (b == false) {
                sum = sum;
            }

        }
//        char d = id.charAt(n - 1);
//        int e = (int) d;

        /*if (sum % 11 == e) {
            return true;

        } else if (sum % 11 == 10) {
            char f = (char) e;
            if (f == 'X') {
                return true;

            } else {
                return false;
            }
        }return false;*/
        int rs1 = sum % 11;
        String lastWord = id.substring(n - 1);

        if (Character.isDigit(id.charAt(n-1))){ //如果最后一个是数
            int lastIndex = Integer.parseInt(lastWord);
            return lastIndex == rs1;
        }else{
            return rs1 == 10 && lastWord.equals("X");
        }


    }
}
