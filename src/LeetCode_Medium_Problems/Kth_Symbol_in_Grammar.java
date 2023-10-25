package LeetCode_Medium_Problems;

public class Kth_Symbol_in_Grammar {
    public int kthGrammar(int level, int position) {
        boolean isSameValue = true;
        int totalElements = 1 << (level - 1); // Using bit shift to calculate 2^(n-1)

        while (totalElements > 1) {
            totalElements >>= 1; // Using bit shift to divide by 2

            // Adjust position and toggle isSameValue flag if position is in the second half
            if (position > totalElements) {
                position -= totalElements;
                isSameValue = !isSameValue;
            }
        }

        return isSameValue ? 0 : 1;
    }
}
