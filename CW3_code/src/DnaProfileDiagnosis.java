import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
//import java.util.Set;
/** @author dzh
 *  @version 1.0 only by dzh
 *  TODO: AACATAAATAAACAAAC and  ATAA 2; AAAC 2;
 *  * TODO: different test 1-6;
 *  * TODO: 当只有一个字符时是错的
 *  */

public class DnaProfileDiagnosis {

    private String dna;
    private LinkedList<String> name;
    private LinkedList<HashMap<String,Integer>> individualList;


   /*
    @param list 表头
    @param dnaNum 单个str对于一个人的重复数
    @param dna 被测序的dna序列
    @param name 名字的列表
    @param individualList 数据库总表
    */

    /** build a database from database.csv*/
    public DnaProfileDiagnosis(String database) {
        File databaseFile = new File(database);// input the .csv file
        // you may add more instance variables
        // but your algorithms must primarily use the following list and/or map
        LinkedList<String> list = new LinkedList<>();//the header of the .csv file(e.g. name, AAGT, …)
        name = new LinkedList<>(); //// Initializes the instance variable
        HashMap<String, Integer> dnaNum = new HashMap<>(); //Individual STR and the number of times it is repeated
        individualList = new LinkedList<>();// Initializes the instance variable
        try {
            Scanner input = new Scanner(databaseFile);
            //输入表头list
            if (input.hasNextLine()) {
                String line  = input.nextLine();
                String[] lists = line.split(",");
                for (int i = 0; i < lists.length; i++) {
                    list.add(lists[i]);
                }
            }
            // 输入每个人的str

            while (input.hasNextLine()) {
                String line1 = input.nextLine();
                String[] values = line1.split(",");
                name.add(values[0]);
                dnaNum.put(values[0],0);
                for (int i = 1; i < values.length; i++) {
                    dnaNum.put(list.get(i), Integer.parseInt(values[i]));
                }
                individualList.add(dnaNum);
                dnaNum = new HashMap<>();
            }
            input.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    /** store a dna sequence with no whitespace from dna.txt */
    public void readDna(String dna) {
        File databaseFile = new File(dna);
        this.dna = "";
        try {
            Scanner input = new Scanner(databaseFile);
            while (input.hasNextLine()) {
                this.dna = this.dna + input.nextLine();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.dna = this.dna.replaceAll("\n","");
        this.dna =this.dna.replaceAll("\t","");
        this.dna =this.dna.replaceAll(" ","");
        this.dna =this.dna.replaceAll("\s","");
    }

    /** based on the STR counts, return either a name in
     database, or "No Match"
     throws IllegalArgumentException if dna has not been set*/
    public String checkProfile() {
        if (this.dna == null) {
            throw new IllegalArgumentException();
        }else {
            //通过遍历把来验证三个str重复是不是都满足
            //第一层循环是遍历数据库所有的人
            for (int i = 0; i < this.name.size(); i++) {
                HashMap<String,Integer> individual = this.individualList.get(i);
                boolean trueTable = true;
                //遍历每一个str
                //Set<String> set = this.individualList.get(i).keySet();
                for (String key : this.individualList.get(i).keySet()) {
                    //用if判断读的那个是不是名字那一行 是的话跳过 应该用遍历找键？
                    if (!key.equals(name.get(i))){

                        //统计该str最长重复次数
                        HashMap<String, Integer> cnt = new HashMap<>();
                        cnt.put(key,0);
                        int count  = 0;
                        int index  = 0;
                        int index1 = key.length();
                        int var = key.length() - 1;
                        //var = key.length() > 1 ?  key.length() - 1 : key.length();
                        for (int i1 = 0; i1 < dna.length(); ++i1) {
                            String testS = "";
                            if (i1 < dna.length() - key.length()) {
                                testS = dna.substring(i1, i1 + key.length());
                                if (key.equals(testS) && index1 == key.length()) {
                                    count++;
                                    index = 0;
                                    index1--;
                                }else {
                                    index++;
                                }
                                if (index == var){
                                    index1 = key.length();
                                }
                                if (count != 0 && index > var){ //要是下一个不是这个str了（即不连续重复了）重置计数器
                                    count = 0;
                                }
                            }else {
                                testS = dna.substring(i1);
                                /** TODO: 这里改了一下防止只有一个A的情况 */
                                boolean a = true;
                                if (index == var && testS.equals(key)){
                                    count++;
                                    a = false;
                                }
                                if (dna.indexOf(key)== i1 && a){
                                    count++;
                                }

                            }
                            if (count >= cnt.get(key)){
                                cnt.put(key, count);
                            }
                        }
                        //判断最长出现是不是一样
                        if (individual.get(key) != cnt.get(key)){
                            trueTable = false;
                        }
                    }
                }
                if (trueTable) {return name.get(i);}
            }
        }
        return "No match";
    }

    /** based on the CAG repeats, return either "Faulty Test",
     "Normal", "High Risk", or "Huntington's"
     throws IllegalArgumentException if dna has not been set */
    public String diagnoseHd() {
        if (this.dna == null) {
            throw new IllegalArgumentException();
        }else {
            String cag = "CAG";
            HashMap<String, Integer> cnt = new HashMap<>();
            cnt.put(cag,0);
            int count  = 0;
            int index  = 0;
            for (int i1 = 0; i1 < dna.length(); ++i1) {
                String testS = "";
                if (i1 < dna.length() - cag.length() ) {
                    testS = dna.substring(i1, i1 + cag.length());
                    if (cag.equals(testS)) {
                        count++;
                        index = 0;
                    }else {
                        index++;
                    }
                    if (count != 0 && index > 2){
                        count = 0;
                    }
                } else {
                    testS = dna.substring(i1);
                    if (index == 2 && testS.equals(cag)){
                        count++;
                    }if (dna.indexOf(cag)== i1){
                        count++;
                    }
                }
                if (count >= cnt.get(cag)){
                    cnt.put(cag, count);
                }
            }
            count = cnt.get(cag);
            if (count >= 0 && count <= 9){
                return  "Faulty Test";
            }else if (count >= 10 && count <= 35){
                return "Normal";
            }else if (count >= 36 && count <= 39){
                return "High Risk";
            }else if (count >= 40 && count <=180){
                return "Huntington's";
            }else {
                return "Faulty Test";
            }
        }
    }

}
