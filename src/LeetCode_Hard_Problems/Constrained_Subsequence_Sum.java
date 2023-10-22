package LeetCode_Hard_Problems;

import java.util.Deque;
import java.util.LinkedList;

public class Constrained_Subsequence_Sum {

    // [10,2,-10,5,20], k = 2
    // Output: 37
    // i(0) = 10, j(1) = 2, 1 - 0 = 1 < k
    // so we determine the condition for the formula from the values of i and j respectively,
    // before checking the value of their index with respect to nums.

    public int constrainedSubsetSum(int[] nums, int k) {
        // create our deque and variables.
        Deque<Integer> dq = new LinkedList<>();
        int ans = nums[0];
        int n = nums.length;

        // create a loop to iterate through our array
        for(int i = 0; i < n; i++) {

            // update nums[i] to hold our final result
            nums[i] += !dq.isEmpty() ? dq.peek() : 0; // [10], [12], [2], [17], [37]
            ans = Math.max(ans, nums[i]);

            // ensure the largest value is to the front of the deque
            while(!dq.isEmpty() && nums[i] > dq.peekLast()) { // N/A, dq - 10, N/A, dq - 2, dq - 5
                dq.pollLast();
            }

            // move our value to its respective position in the decreasing deque
            if(nums[i] > 0) {
                dq.offer(nums[i]); // dq = [10], dq = [12], dq = [12, 2], dq = [17, 5], dq = [37]
            }

            // Remove elements out of the current window
            if (i >= k && !dq.isEmpty() && dq.peek() == nums[i - k]) {
                dq.poll();
            }
        }

        return ans; //37
    }
}
