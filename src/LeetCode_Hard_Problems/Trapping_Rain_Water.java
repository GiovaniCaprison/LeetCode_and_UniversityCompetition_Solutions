package LeetCode_Hard_Problems;

public class Trapping_Rain_Water {

    //FIRST SOLUTION:
    /*public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return ans;
    }
} */

    //SECOND SOLUTION:
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lmax = height[0], rmax = height[height.length - 1];
        int ans = 0;
        while (l < r) {
            if (lmax < rmax) {
                l++;
                if (lmax < height[l]) {
                    lmax = height[l];
                } else {
                    ans += lmax - height[l];
                }
            } else {
                r--;
                if (rmax < height[r]) {
                    rmax = height[r];
                } else {
                    ans += rmax - height[r];
                }
            }
        }
        return ans;
    }
}
