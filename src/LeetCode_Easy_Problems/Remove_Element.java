class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, i = 0, n = nums.length, j = n-1;

        while(i <= j) {
            if(nums[i] != val) {
                i++;
                count++;
            }
            if(i < n && nums[i] == val && nums[j] != val) {
                nums[i++] = nums[j--];
                count++;
            }
            else if(i < n && nums[i] == val && nums[j] == val) {
                while(j >= i && nums[j] == val) j--;
            }
        }
        return count;
    }
}