class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int zerocount = 0, count = 0, n = nums.length, max = 0, zeroindex = 0;

        for(int i = 0; i < n; i++) {

            if(nums[i] == 1) {
                count++;
            }
            else if(nums[i] == 0) {
                if(zerocount == 0) {
                    zerocount++;
                    count++;
                    zeroindex = i;
                }
                else {
                    zerocount--;
                    count = 0;
                    i = zeroindex;
                }
            }
            if(max < count) max = count;
        }

        return max;
    }
}