class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0, j = nums.length -1, k = j;
        int[] ans = new int[k+1];

        while(i <= j) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[k--] = nums[i] * nums[i];
                i++;
            }
            else {
                ans[k--] = nums[j] * nums[j];
                j--;
            }
        }

        return ans;
    }
}