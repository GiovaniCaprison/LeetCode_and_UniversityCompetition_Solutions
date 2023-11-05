class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] arr = new boolean[n];

        for(int i = 0; i < n; i++) {
            int temp = nums[i] - 1;
            if(!arr[temp]) arr[temp] = true;
        }

        for(int i = 0; i < n; i++) {
            if(!arr[i]) list.add(i+1);
        }
        return list;
    }
}