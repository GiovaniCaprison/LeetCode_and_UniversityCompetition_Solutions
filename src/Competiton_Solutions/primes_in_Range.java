package Competiton_Solutions;

import java.util.Scanner;
import java.util.Arrays;
class primes_in_Range {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lower bound of the range: ");
        int lowerBound = scan.nextInt();

        System.out.println("Enter the upper bound of the range: ");
        int upperBound = scan.nextInt();

        if(lowerBound > upperBound) upperBound = lowerBound;

        boolean [] arr = new boolean[upperBound - lowerBound + 1];

        Arrays.fill(arr, true);

        for(int i = 2; i <= Math.sqrt(upperBound); i++) {
            if(arr[i]) {
                for(int j = i * i; j <= upperBound; j += i) {
                    arr[j] = false;
                }
            }
        }

        int count = 0;

        for (boolean b : arr) {
            if (b) {
                count++;
            }
            System.out.println("There are " + count + " prime numbers in the range [" + lowerBound + ", " + upperBound + "].");
        }
    }
}