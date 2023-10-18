package Competiton_Solutions;

import java.util.Scanner;
class Check_If_Happy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int checkHappy = scan.nextInt(); // User input
        if(checkHappy < 1) { // Check if input is a natural number
            System.out.println("Happy numbers must be a natural number.");
            return;
        }
        if (happyHelper(checkHappy)) { // Check if input is a happy number
            System.out.println(checkHappy + " is a Happy number.");
        } else {
            System.out.println(checkHappy + " is NOT a Happy number.");
        }
    }

    public static boolean happyHelper(int checkHappy) {
        int x = checkHappy, y = checkHappy; // Two pointers
        do {
            x = getSum(x); // Slow pointer
            y = getSum(getSum(y)); // Fast pointer
        } while (x != y); // Verify the loop

        return x == 1; // If the loop is broken by 1 then it is a happy number
    }

    public static int getSum(int x) {
        int res = 0; // Result
        while (x != 0) { // Loop through the number
            int temp = x % 10; // Get the last digit
            res += temp * temp; // Add the square of the last digit to the result
            x /= 10; // Remove the last digit
        }
        return res; // Return the result
    }
}
