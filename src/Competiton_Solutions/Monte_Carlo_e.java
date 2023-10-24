package Competiton_Solutions;

import java.util.Scanner;

public class Monte_Carlo_e {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        double e = Math.exp(1.0);

        System.out.println("The value of e is: " + e);
        System.out.println("The absolute error is: " + (e - absError(e,lim)));
    }

    private static double absError(double e, int lim) {

        double res = 0.0;

        for(int i = 0; i < lim; i++) {
            double rand = Math.random() * e;
            res+= rand;
        }
        return res/lim;
    }
}
