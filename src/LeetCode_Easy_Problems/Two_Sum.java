package LeetCode_Easy_Problems;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        // create HashMap 'map' to store remainders.
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // for loop will check for keys in 'map' which == the remainder of target - nums[i].
        for(int i = 0; i < n; i++) {

            // create temp variable to store the remainder of target - the current index of nums.
            int temp = target - nums[i];

            // if the remainder == a stored key in 'map' return the value of the remainder key and i.
            if(map.containsKey(temp)) return new int [] {map.get(temp), i};

            // add the current index of nums to 'map'.
            map.put(nums[i], i);
        }

        // no result found.
        return new int [0];
    }
}
