package Competiton_Solutions;

import java.util.Scanner;
import java.util.Random;

public class Monte_Carlo_e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of trials: ");
        int N = scan.nextInt();
        double estimatedE = estimateE(N);
        double actualE = Math.E;
        double absoluteError = Math.abs(estimatedE - actualE);
        double relativeError = absoluteError / actualE;
        double percentageError = relativeError * 100;

        System.out.println("Estimated value of e: " + estimatedE);
        System.out.println("Actual value of e: " + actualE);
        System.out.println("Percentage error: " + percentageError + "%");
    }


    public static double estimateE(int N) {
        Random rand = new Random();
        int count = 0;

        for (int i = 0; i < N; i++) {
            double sum = 0;
            int n = 0;
            while (sum <= 1) {
                sum += rand.nextDouble(); // Generates a random double between 0.0 and 1.0
                n++;
            }
            count += n;
        }

        return (double) count / N;
    }
}
