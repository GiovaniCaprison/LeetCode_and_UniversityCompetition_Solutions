// FIRST SOLUTION SIGNIFICANTLY SLOWER THAN SECOND SOLUTION:

class Solution {
    public int[] findMode(TreeNode root) {

        if(root.left == null && root.right == null) return new int[] {root.val};

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        while(root != null || !stack.isEmpty()) {

            while(root!=null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            root = root.right;
        }

        for(Integer key : map.keySet()) {

            int temp = map.get(key);

            if(temp == max) {
                list.add(key);
            }

            else if(temp > max) {
                list = new ArrayList<Integer>();
                list.add(key);
                max = temp;
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

// SECOND SOLUTION SIGNIFICANTLY FASTER THAN FIRST SOLUTION:

class Solution {
    int count = 0, max = 0, curr = 0;
    List<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {

        if(root.left == null && root.right == null) return new int[] {root.val};

        inOrder(root);

        int n = list.size();

        int[] ans = new int[n];

        for(int i = 0 ; i < n ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    void inOrder(TreeNode root) {

        if(root == null) return;

        inOrder(root.left);

        int num = root.val;

        if(curr == num) {
            count++;
        }
        else{
            count = 1;
            curr = root.val;
        }
        if(max < count) {
            max = count;
            list = new ArrayList<>();
        }
        if(max == count) {
            list.add(num);
        }

        inOrder(root.right);

        return;
    }
}