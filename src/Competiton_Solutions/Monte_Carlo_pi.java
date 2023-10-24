package Competiton_Solutions;

import java.util.Scanner;
public class Monte_Carlo_pi {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        double pi = Math.PI;
        System.out.print(estimatePi(pi,lim));

    }

    private static double estimatePi(double pi, int lim) {
        double res = 0.0;
        for(int i = 0; i < lim; i++) {
            double x = Math.random() * pi;
            double y = Math.random() * pi;
            res += (x*x + y*y <= pi*pi ? 1 : 0);
        }
        return res/lim;
    }

}
