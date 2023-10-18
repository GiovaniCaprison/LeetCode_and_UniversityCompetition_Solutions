
class Validate_Binary_Tree_Nodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] hasParent = new int[n];
        boolean[] hasCycle = new boolean[n];

        // Initialize all nodes to have no parent.
        for (int i = 0; i < n; i++) {
            hasParent[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                // If the child already has a parent, it's an invalid tree.
                if (hasParent[leftChild[i]] != -1) return false;
                hasParent[leftChild[i]] = i;
            }
            if (rightChild[i] != -1) {
                if (hasParent[rightChild[i]] != -1) return false;
                hasParent[rightChild[i]] = i;
            }
        }

        // Find the root.
        int count = 0;
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (hasParent[i] == -1) {
                count++;
                root = i;
            }
        }

        // There should be only one root.
        if (count != 1) return false;

        // BFS traversal
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int temp = q.poll();
            if (hasCycle[temp]) return false; // If we've seen the node before, it's a cycle.
            hasCycle[temp] = true;

            if (leftChild[temp] != -1) q.add(leftChild[temp]);
            if (rightChild[temp] != -1) q.add(rightChild[temp]);
        }

        // Check if all nodes are visited
        for (int i = 0; i < n; i++) {
            if (!hasCycle[i]) return false;
        }

        return true;
    }
}