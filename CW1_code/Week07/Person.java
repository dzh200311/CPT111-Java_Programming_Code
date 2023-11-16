package Week07;
//@fuckU
public class Person {
    private String name;
    private String gender;
    private String city;
    private String dateOfBirth;
    private int idNumber; // instance variables of Person

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getIdNumber() {
        return idNumber;
    }



    //constructor
    public Person() {
    }

    public Person(String name, String gender, String city, String dateOfBirth, int idNumber){ //parameter local to
        // Person constructor
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        System.out.println(this);
    } // constructor

    public void setName(String nextLine) {
        this.name = nextLine;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
