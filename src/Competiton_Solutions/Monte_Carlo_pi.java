package Competiton_Solutions;

import java.util.Random;
import java.util.Scanner;

public class Monte_Carlo_pi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // Number of random points
        double estimatedPi = estimatePi(N);
        System.out.println("Actual PI: " + Math.PI);
        System.out.println("Estimated value of PI: " + estimatedPi);
        System.out.println("Absolute error: " + Math.abs(1 - Math.PI/estimatedPi) + "%");
    }

    public static double estimatePi(int N) {
        Random rand = new Random();
        int M = 0; // Number of points inside the quarter circle

        for (int i = 0; i < N; i++) {
            double x = rand.nextDouble() * 2 - 1; // Random x coordinate between -1 and 1
            double y = rand.nextDouble() * 2 - 1; // Random y coordinate between -1 and 1

            if (x * x + y * y <= 1) {
                M++;
            }
        }

        return 4.0 * M / N;
    }
}