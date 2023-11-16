package Week13;

public class Undergrad extends Person {
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    private int level;

    public Undergrad(String name, int l) {
        super(name);
        level = l;
    }

    @Override
    public String toString() {
        return "Undergrad name: " + super.toString() + ", level: " + level;
    }
}
