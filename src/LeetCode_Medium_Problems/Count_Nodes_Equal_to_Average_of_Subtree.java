class Solution {
    int [] ans = new int[1];
    public int averageOfSubtree(TreeNode root) {

        if(root.right == null && root.left == null) return 1;

        DFS(root);

        return ans[0];

    }

    int[] DFS(TreeNode root) {

        if(root == null) return new int[] {0,0};

        int[] left = DFS(root.left);
        int[] right = DFS(root.right);

        int currsum = left[0] + right[0] + root.val;
        int num = left[1] + right[1] + 1;

        if(root.val == currsum / num) ans[0]++;

        return new int[] {currsum, num};
    }
}