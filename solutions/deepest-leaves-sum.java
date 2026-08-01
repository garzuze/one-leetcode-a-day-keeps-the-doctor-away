class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    private int sum = 0;
    private int depth = 0;

    public int deepestLeavesSum(TreeNode root) {
        depth = getDepth(root);
        dfs(root, 1);
        return sum;
    }

    private void dfs(TreeNode focus, int curr) {
        if (focus == null) {
            return;
        }

        if (curr == depth) {
            sum += focus.val;
        }
        
        dfs(focus.left, curr + 1);
        dfs(focus.right, curr + 1);
    }

    private int getDepth(TreeNode focus) {
        if (focus == null) {
            return 0;
        }

        return 1 + Math.max(getDepth(focus.left), getDepth(focus.right));
    }
}
