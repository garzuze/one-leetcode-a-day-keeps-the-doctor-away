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
    private int result = 0;
    public int goodNodes(TreeNode root) {
        this.traverse(root, root.val);
        return result;
    }

    void traverse(TreeNode focus, int max) {
        if (focus == null) return;
        if (focus.val >= max) {
            result++;
            max = focus.val;
        }
        traverse(focus.left, max);
        traverse(focus.right, max);
    } 
}
