package Week11;

import java.util.Scanner;

/**
 *
 * @author Erick.Purwanto
 */
public class Swordsman {
    private double healthPoints;
    private String name;
    private boolean alive;
    protected int numDemonsKilled;
    
    private static int numSwordsman = 0;
    
    public Swordsman(String name) {
        this.name = name;
        healthPoints = 100;
        alive = true;
        numDemonsKilled = 0;
        numSwordsman++;
    }
    
    public Swordsman(String name, int numDemonsKilled) {
        this(name);
        this.numDemonsKilled = numDemonsKilled;
        healthPoints = 100;
    }

    public Swordsman (String name, double healthPoints) {
        this(name);
        this.healthPoints = healthPoints;

    }

    public double receiveDamage(double damagePoint) {
        if (damagePoint <= 0){
            throw new IllegalArgumentException("nmmd");
        }
        healthPoints = healthPoints - damagePoint;
        if ( healthPoints <= 0 ) {
            healthPoints = 0.0;
            alive = false;
        }
        return healthPoints;
    }

    public double receiveDamage(){
        return  receiveDamage(healthPoints * 0.1);
    }
    
    public Swordsman() {
        this("Nameless");
    }
    
    public static int getNumSwordsman() {
        return numSwordsman;
    }
    
    public int getNumSwordsmanInst() {
        return numSwordsman;
    }

    /*public int getNumDemonsKilled() {
        return numDemonsKilled;
    }    */
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void killsDemon() {
        numDemonsKilled++;
    }
    
    public void killsDemon(int demonsKilled) {
        numDemonsKilled += demonsKilled;
    }
    
    public String toString() {
        String alive;
        if (this.alive) alive = "alive";
        else            alive = "dead";
        return "Swordsman " + name + " is " + alive + " and has killed " +
                numDemonsKilled + " demons";
    }
    
    public static boolean sameNumDemonsKilled(Swordsman s1, Swordsman s2) {
        return s1.numDemonsKilled == s2.numDemonsKilled;
    }
    
    public int attackDamage() {
        return 10 + 5 * numDemonsKilled;
    }
    
    public static void main(String[] args) {
        Swordsman tanjiro = new Swordsman("Tanjiro");
        tanjiro.killsDemon();
        // System.out.println(tanjiro);
        
        Swordsman zenitsu = new Swordsman("Zenitsu", 1);
        boolean sameKills = sameNumDemonsKilled(tanjiro, zenitsu);
        System.out.println(sameKills);
        
        //int numSwordsmanCreated = numSwordsman();
        //System.out.println(numSwordsmanCreated);
        
        System.out.println(getNumSwordsman());
        System.out.println(tanjiro.getNumSwordsmanInst());
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        try {
            System.out.println(myIntDiv(1, n)); }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



        
    }

    public static int myIntDiv(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("你妈死了");
        else return a / b;
    }
}