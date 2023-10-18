class Maximum_Depth_of_Binary_Tree {
    public int DFS(TreeNode root) {

        if(root == null) return 0; // Base case

        int l = 1 + DFS(root.left); // Recursive call
        int r = 1 + DFS(root.right); // Recursive call

        return Math.max(l, r); // Return the maximum depth
    }
}

//we can also use BFS to solve this problem
    public int BFS (Treenode root) {

        if (root == null) return 0; // base case

        Queue<TreeNode> queue = new LinkedList<>(); // initialize the queue
        queue.offer(root); // add the root node to the queue
        int count = 0; // initialize the level

        while (!queue.isEmpty()) { // loop through the queue to traverse the tree
            int size = queue.size(); // get the size of the current level
            while (size-- > 0) { // loop through the current level
                TreeNode cur = queue.poll(); // get the current node
                if (cur.left != null) queue.offer(cur.left); // add left child
                if (cur.right != null) queue.offer(cur.right); // add right child
            }
            count++; // increment the level
        }

        return count;
    }