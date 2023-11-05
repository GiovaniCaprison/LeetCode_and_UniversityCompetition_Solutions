class Solution {
    public List<String> buildArray(int[] target, int nums) {
        int index = 0;
        int num = 1;
        int n = target.length;
        List<String> list = new ArrayList<>();

        while(index < n && num <= nums)  {
            list.add("Push");
            if(target[index] == num) index++;
            else list.add("Pop");
            num++;
        }
        return list;
    }
}