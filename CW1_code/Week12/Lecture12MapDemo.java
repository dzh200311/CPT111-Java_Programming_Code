package Week12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Erick.Purwanto
 */
public class Lecture12MapDemo {
    
    public static void main(String[] args) {
        Swordsman tanjiro = new Swordsman("Tanjiro", 5);
        Swordsman zenitsu = new Swordsman("Zenitsu", 2);
        Swordsman inosuke = new Swordsman("Inosuke", 10);
        
        Map<String, Swordsman> troops = new HashMap<>();
        troops.put("Tanjiro", tanjiro);
        troops.put("Zenitsu", zenitsu);
        troops.put("Inosuke", inosuke);
        
        Swordsman swordsman;
        swordsman = troops.get("Kyojuro");
        //swordsman.killsDemon(); NullPointerException
        System.out.println(swordsman);

        if (troops.containsKey("Tanjiro")) {
            swordsman = troops.get("Tanjiro");
            // do something with swordsman
        }

       

        for (String key : troops.keySet()) {
            System.out.println(key + ": " + troops.get(key));
        }

    }
}
