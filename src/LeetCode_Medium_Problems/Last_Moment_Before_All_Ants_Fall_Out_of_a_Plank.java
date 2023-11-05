class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {

        int max = 0, l = left.length, r = right.length;

        for(int i = 0; i < l; i++) {
            max = Math.max(left[i], max);
        }

        for(int i = 0; i < r; i++) {
            max = Math.max(n - right[i], max);
        }

        return max;
    }
}