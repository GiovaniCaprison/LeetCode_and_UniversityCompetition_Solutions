class Solution {
    public int getWinner(int[] arr, int k) {

        int n = arr.length, count = 0, max = arr[0];

        for(int i = 1; i < n; i++) {

            if(arr[i] > max) {
                count = 0;
                max = arr[i];
            }

            if(++count >= k) {
                return max;
            }
        }

        return max;
    }
}