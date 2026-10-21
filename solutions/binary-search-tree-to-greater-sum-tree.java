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
    int count = 0;
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode focus) {
        if (focus != null) {
            traverse(focus.right);
            count += focus.val;
            focus.val = count;
            traverse(focus.left);
        }
    }
}
