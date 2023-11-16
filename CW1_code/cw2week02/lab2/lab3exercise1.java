package cw2week02.lab2;

import java.util.Scanner;

public class lab3exercise1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the min number");
        int min = Integer.parseInt(kb.nextLine());
        System.out.println("Input the max number");
        int max = Integer.parseInt(kb.nextLine());

//         String next1  = kb.nextLine();
//        int max = Integer.parseInt(next1);
        int RandomInt = min + (int)(Math.random() * (max - min + 1));
        int RandomInt2 = min + (int)(Math.random() * (max - min + 1));

        System.out.println("the first random int is "+ RandomInt);
        System.out.println("the Second random int is "+ RandomInt2);
        boolean smaller =  RandomInt < RandomInt2;
        boolean equal = RandomInt == RandomInt2;
        boolean bigger = RandomInt2 < RandomInt;
        System.out.println("first < second is " + smaller);
        System.out.println("first = second is " + equal);
        System.out.println("first > second is " + bigger);





    }
}
