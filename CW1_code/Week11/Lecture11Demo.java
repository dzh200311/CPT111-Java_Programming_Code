package Week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Erick.Purwanto
 * @version 123123231.1
 */
public class Lecture11Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //=================file 类的常用方法=================
        /*File file = new File("src/Week11/data/text1.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());

        System.out.println("================================================");*/


        // =================create a new file================

        /*File newFile = new File("src/Week11/data/text2.txt");
        if (newFile.exists()) {  // checking for existence first so that not overwritting
            System.out.println("File already exists!");  //if so, print message and exit the program
            System.exit(0);
        }

        try {
            PrintWriter output2 = new PrintWriter(newFile);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }*/

        //====================write file================

        File file = new File("src/Week11/data/text1.txt");

        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Tanjiro");
            output.println("Zenitsu");
            output.println("Inosuke");
            output.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        //====================improve write file================

        /*try {
            FileWriter file = new FileWriter("src/Week11/data/text1.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("Tanjiro");
            buffer.newLine();
            buffer.write("Zenitsu");
            buffer.newLine();
            buffer.write("Inosuke");
            buffer.newLine();
            buffer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }*/

        //====================read file================

        /*File file = new File("src/Week11/data/text1.txt");
        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String name = input.nextLine();
                Swordsman swordsman = new Swordsman(name);
                System.out.println(swordsman);
            }

            input.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }*/

        /*File file = new File("src/Week11/data/demonslayerdata.csv");
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine(); // see lecture String
                String[] values = line.split(",");
                String name = values[0];
                int numDemonsKilled = Integer.parseInt(values[1]);
                Swordsman swordsman = new Swordsman(name, numDemonsKilled);
                System.out.println(swordsman);
            }
            input.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }*/



        /*File file = new File("src/Week11/data/text1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
*/




    }

}
