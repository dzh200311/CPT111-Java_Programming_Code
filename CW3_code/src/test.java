import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        /*int count = 0;
        String dnaStr = "AAGTAAGTAAGT";
        if (dna.contains(dnaStr)) {
            int start1 = 0;
            while (true) {
                int found = dna.indexOf(dnaStr, start1);
                //如果下一个找到的不是前面的+4 意思就是要是不重复就停止
                if (found != -1) {
                    count++;
                    if (dna.indexOf("AAGT", found + 4 * 3) == found + 4 * 3) {
                        count--;
                    }
                }
                if (found == -1) {
                    break;
                }
                start1 = found + 4 * 3;
            }
        } */
        String dna = "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTCAGCAGCAGCAGCAGCAGCAGTTTAAGTAAGTAAGTTTCAGCAGCAGCAGCAGCAGCAGCAGCAGCAGTCAGTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTATGTATGTATGTATGTATGTATGTATGTATGTTTTTTTTACTCACTCACTCACTCACTCACTCACTCACTCACTCACTCTAGTTAGTTAGTTAGTTAGTTAGTAATCAATCGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGGGTGTCATTCATTCATTCATTCATTCATTCATTCATTCATTCATTCATTCAT";
        String[] a = dna.split("AAGT");
        System.out.println(a);
        List<String> ans = findRepeatedDnaSequences("AAAAACCCCCAAAAAGGGTTTAAAAACCCCCC");
        System.out.println(ans);
        String s= "";
        System.out.println(s.length());

    }

    static final int L = 10;

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        int n = s.length();
        for (int i = 0; i <= n - L; ++i) {
            String sub = s.substring(i, i + L);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }
    public static int larger(int x, int y) {
        if (x > y)
            return x;
        return y;
    }

    public static int larger(int x, int y,int z){
        int max = larger(x,y);
        return larger(x,y);
    }


}
