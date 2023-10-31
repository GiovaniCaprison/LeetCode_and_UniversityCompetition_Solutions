class Solution {
    public int[] sortByBits(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++) {

            nums[i]+=Integer.bitCount(nums[i])*10001;

        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {

            nums[i] = nums[i]%10001;

        }

        return nums;
    }
}