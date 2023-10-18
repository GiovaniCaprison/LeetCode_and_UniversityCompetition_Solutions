package LeetCode_Easy_Problems;

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
class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true; // Base case (we have reached the end of the tree)

        if(p == null || q == null || p.val != q.val) return false; // Base case (TreeNodes do not match)

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // Recursive Call (iterate through the branches until we reach a base case)
    }
}
