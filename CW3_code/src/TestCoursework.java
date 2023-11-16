
public class TestCoursework {

    public static void main(String[] args) {
        
        String db1 = "data/db1.csv";
        DnaProfileDiagnosis test = new DnaProfileDiagnosis(db1);
        String dna1 = "data/dna1.txt";
        test.readDna(dna1);
        System.out.println(test.checkProfile()); // Alice
        System.out.println(test.diagnoseHd());   // Normal
        String dna2 = "data/dna2.txt";
        test.readDna(dna2);
        System.out.println(test.checkProfile()); // Bob
        System.out.println(test.diagnoseHd());   // Huntington's

        try {
            String db2 = "data/db2.csv";
            DnaProfileDiagnosis test2 = new DnaProfileDiagnosis(db2);
        String dna3 = "data/dna3.txt";
        test2.readDna(dna3);
            System.out.println(test2.checkProfile());
            System.out.println(test2.diagnoseHd());// IllegalArgumentException thrown
        } catch (Exception e) {
            System.out.println("IllegalArgumentException thrown");
        }
        String db3 = "data/nDB.csv";
        DnaProfileDiagnosis test3 = new DnaProfileDiagnosis(db3);
        String dna4 = "data/n.txt";
        test3.readDna(dna4);
        System.out.println(test3.checkProfile());
        System.out.println(test3.diagnoseHd());


    }
}
