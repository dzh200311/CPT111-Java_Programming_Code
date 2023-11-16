package Week06;


public class test {
    public static void main(String[] args) {
        String cosmo = "HalloweHalloenHalloween";
        findHallo(cosmo);
        String str = "\"25000 gross income, -200 water, electricity:-300" ;
        str = str.trim();
        String str2="";
        if (str!= null && !"".equals(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57 || str.charAt(i) == 45) {
                    str2 += str.charAt(i);
                }
            }
        }
        System.out.println(str2);


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
}
