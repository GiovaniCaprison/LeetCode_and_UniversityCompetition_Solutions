package LeetCode_Medium_Problems;

public class Container_With_Most_Water {
    // FIRST SOLUTION
/*  public int maxArea(int[] height) {
        // create variables.
        int i = 0, j = height.length - 1, maxVal = 0;

        //while loop to find largest area.
        while(i < j) {

            // find the multiplier.
            int width = j - i;

            // update our area.
            maxVal = Math.max(maxVal, Math.min(height[i], height[j]) * width);

            // if height[i] <= height[j] we increment from the left to check for any larger values
            if(height[i] <= height[j]) {
                i++;
            }

            // the opposite for height[i] > height[j].
            else {
                j--;
            }
        }

        return maxVal; // return our area.
} */

    // I think we can make this faster with two nested loops instead of our if - else statement.
    public int maxArea(int[] height) {
        // SECOND SOLUTION:
        // create variables.
        int i = 0, j = height.length - 1, maxVal = 0;

        //while loop to find the largest area.
        while (i < j) {

            // find our scalar values for calculating area.
            int width = j - i;
            int maxH = Math.min(height[i], height[j]);

            // update our maximum area.
            maxVal = maxVal > maxH * width ? maxVal : maxH * width;

            // if height[i] < the max height found so far, we increment from the left
            while (i < j && height[i] <= maxH) {
                i++;
            }

            // the opposite for height[i] > height[j].
            while (i < j && height[j] <= maxH) {
                j--;
            }
        }

        return maxVal; // return our area.
    }
}
// using the updated approach we finish 3ms faster, decreasing runtime by 60%.
