package Week06;

public class lectureDemo_String {
    public static void main(String[] args) {
        // public int (name.)length: 字符串长度
        // char name.charAt(int index) : 索引位置处的字符
        // char[] name.toCharArray() : 把字符串转换成字符数组 ---可以遍历
        // toUpperCase & toLowerCase : 大小写
        // str.indexOf（String target, int fromIndex）方法在str内从左到右搜索字符串目标(从fromIndex开始）
            //○它返回首次找到目标字符串的索引号，如果没有找到目标，则返回-1
            //○区分大小写
            //○您可以使用这个而不是前环来迭代并查找字符串
        // str.lastindexOf(String target, int fromIndex) 从右往左搜索(从fromIndex开始）


        //equals or equalsIgnoreCase:判断是否相等 由于==判断的是地址所以不能用 IgnoreCase是忽略大小写
        //===============================================================
        //○ boolean isEmpty()   //is string an empty string?
        //○ boolean contains(String substring) //does string contain substring?
        //○ boolean startsWith(String prefix)    does string start with prefix?
        //○ boolean endsWith(String postfix)      does string end with postfix?


        //================================================================
        // 截取内容（包前不包后）
        // substring Another version substring(int start, int end) returns a new string of the
        // chars starting at index start up to but not including the end index
        //○ notice the length of the resulting substring can be computed by subtracting end-start
        String cosm0 = "Halloween";
        String ss1 = cosm0.substring(2, 5); //左开右闭
        System.out.println(ss1);

        String ss2 = cosm0.substring(8, 9);
        System.out.println(ss2);
        System.out.println("================================");
        //————————————————————————————————
        /*Other popular string methods:
        ○ String trim() this string with leading and trailing whitespace removed 根据传入的规则切割字符串 得到字符串数组返回
        ○ String replace(String a, String b) === this string with a replaced by b
        ○ String replaceAll(String a, String b) === this string with all a's replaced by b's
        ○ String[]split(String delimiter) === array of strings between occurrences of delimiter*/
        // =================================================
        String cosmo1 = " ha haa halloween ";

        cosmo1 = cosmo1.trim();
        System.out.println(cosmo1);

        cosmo1 = cosmo1.replaceAll("h", "H");
        System.out.println(cosmo1);

        String[] words = cosmo1.split(" ");//words:["Ha", "Haa", "Halloween"]
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("================================");
        // =================================================
        String cosmo = "Halloween(hallo)Halloween";
        String str = "(helloworld)";
        findHallo(cosmo);
        String rs = capitalParen(str);
        System.out.println(rs);

        boolean a = str.equals("helloworld");

    }
    // You may use indexOf to find all the instances of a target string, or just use the standard for-loop
    //● For example, we use indexOf in a loop to find all string "Hallo" in str
    //○ notice the start variable is used in the loop to keep resetting the starting point
    //of the search
    public static void findHallo(String str){
        int start = 0;
        while(true){
            int found = str.indexOf("Hallo",start);
            if (found != -1){
                System.out.println(found);
            }
            if(found == -1){
                break; // found none, need to stop looping
            }
            start = found + 5; // move start up for next iteration （实测加5以下好像都可）
        }
    }

    public static String capitalParen(String str) {
        int left = str.indexOf("(");
        int right = str.indexOf(")");
        String sub = str.substring(left + 1, right);
        sub = sub.toUpperCase();
        String result = str.substring(0, left + 1) + sub + str.substring(right);
        return result;
    }
}
