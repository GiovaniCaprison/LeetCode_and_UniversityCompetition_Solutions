package Competiton_Solutions;
import java.util.Scanner;

public class Balanced_Word_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if it's balanced:");
        String word = scanner.nextLine().toLowerCase();

        int leftSum = 0;
        int rightSum = 0;

        int length = word.length();
        int middle = length / 2;

        for (int i = 0; i < middle; i++) {
            leftSum += word.charAt(i) - 'a' + 1;
        }

        for (int i = length % 2 == 0 ? middle : middle + 1; i < length; i++) {
            rightSum += word.charAt(i) - 'a' + 1;
        }

        System.out.println("side 1 total is " + leftSum);
        System.out.println("side 2 total is " + rightSum);

        if (leftSum == rightSum) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }

        scanner.close();
    }
}
