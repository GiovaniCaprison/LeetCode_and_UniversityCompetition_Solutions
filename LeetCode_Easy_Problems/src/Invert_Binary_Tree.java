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
class Invert_Binary_Tree {
    public static reverseOfBinaryTree(TreeNode root) {
        reverse(root); // call the reverse function
        return root; // return the root
    }
    static TreeNode reverse (TreeNode root) {

        if(root == null) return root; // base case

        reverse(root.left); // recursive call
        reverse(root.right); // recursive call
        TreeNode temp = root.left; // set dummy node to the left node
        root.left = root.right; // swap the left node with the right
        root.right = temp; // swap the right node with temp
        return root; // return the root
    }
}