class Solution {
public int thirdMax(int[] nums) {

        int n = nums.length-1;

        Arrays.sort(nums);
        int ans, i = n, curr = nums[n], max = nums[n];

        while(i >= 0 && nums[i] == curr) i--;

        if(i < 0) return max;

        curr = nums[i];

        while(i >= 0 && nums[i] == curr) i--;

        return i < 0 ? max : nums[i];
        }
        }