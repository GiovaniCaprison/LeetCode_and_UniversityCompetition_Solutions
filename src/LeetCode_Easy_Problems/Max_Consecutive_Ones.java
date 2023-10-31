class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length,max = 0;


        for(int i = 0; i < n; i++) {
            int temp = 0;
            if(nums[i] == 1) {
                while(i < n && nums[i] == 1) {
                    temp++;
                    i++;
                }
                max = temp > max ? temp : max;
                i--;
            }
        }
        return max;
    }
}