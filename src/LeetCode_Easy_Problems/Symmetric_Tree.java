package LeetCode_Easy_Problems;

public class Symmetric_Tree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    private boolean isSymmetric(TreeNode root) {
        if(root == null) return true; // return early
        return symmetry(root.left, root.right); // call method to check for symmetry
    }
    boolean symmetry(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true; // first base case

        if(root1 == null || root2 == null) return false; // second base case

        return root1.val == root2.val && symmetry(root1.left, root2.right) && symmetry(root1.right, root2.left); //conditional recursive call
    }
}

