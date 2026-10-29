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
    public TreeNode pruneTree(TreeNode root) {
        traverse(root);
        if (isLeafZero(root)) {
            return null;
        }
        return root;
    }

    public void traverse(TreeNode focus) {
        if (focus != null) {
            traverse(focus.left);
            traverse(focus.right);
            
            if (focus.left != null && isLeafZero(focus.left)) {
                focus.left = null;
            }

            if (focus.right != null && isLeafZero(focus.right)) {
                focus.right = null;
            }

        }
    }

    private boolean isLeafZero(TreeNode focus) {
        return (focus.left == null && focus.right == null && focus.val == 0);
    }
}
