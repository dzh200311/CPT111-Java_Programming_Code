package cw1week03;

import java.util.Scanner;

public class PandemicSpread {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int init = Integer.parseInt(kb.nextLine());
        int numInfect = Integer.parseInt(kb.nextLine());
        int population = Integer.parseInt(kb.nextLine());
        int count = 1;
        while (init < population){
            init = init + init * numInfect;
            count = count + 1;
        }
        System.out.println(count);

    }
}
