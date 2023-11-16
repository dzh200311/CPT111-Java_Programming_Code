package Week09;

import Week11.Swordsman;

/**
 *
 * @author Erick.Purwanto
 */
public class Pillar extends Swordsman {
    
    private final String type;

    
    public Pillar(String name, String type) {
        super(name);
        this.type = type;
    }
    
    public Pillar(String name, int numDemonsKilled, String type) {
        super(name, numDemonsKilled);
        this.type = type;

    }

    public String getType() {
        return type;
    }
    
    @Override
    public int attackDamage() {
        //return 1000 + 100 * getNumDemonsKilled();
        return 1000 + 100 * super.attackDamage();
    }

//    // typo in method name
//    public int attackDammage() {
//        return 1000 + 100 * getNumDemonsKilled();
//    }
    
    @Override
    public String toString() {
        return type + " Pillar " + getName() + " has killed " +
                numDemonsKilled + " demons";

    }

    @Override
    public double receiveDamage(double damagePoint) {
        damagePoint *= 0.5;
        return super.receiveDamage(damagePoint);
    }


    
    public static void main(String[] args) {
        //Pillar kyojuro = new Pillar("Kyojuro", 1000, "Fire");
//        System.out.println(kyojuro.getName());
//        System.out.println(kyojuro);
        
        //Pillar kyojuro = new Pillar("Kyojuro", 10000, "Fire");
        //System.out.println(kyojuro.attackDammage());
        //System.out.println(kyojuro);
        
        Swordsman kyojuro = new Pillar("Kyojuro", 10000, "Fire");
       /* try {
            double newHP = kyojuro.receiveDamage(10);
        } catch (IllegalArgumentException iae) {*/
            System.out.println(kyojuro.receiveDamage(10));;
        //}
        System.out.println(kyojuro);


    }
}
