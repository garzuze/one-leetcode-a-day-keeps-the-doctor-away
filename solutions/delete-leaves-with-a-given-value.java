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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        traverse(root, target);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    private void traverse(TreeNode focus, int target) {
        if (focus != null) {
            traverse(focus.left, target);
            traverse(focus.right, target);
            if (
                focus.left != null && 
                focus.left.left == null && 
                focus.left.right == null && 
                focus.left.val == target
                ) {
                focus.left = null;
            }

            if (
                focus.right != null && 
                focus.right.left == null && 
                focus.right.right == null &&
                focus.right.val == target
                ) {
                focus.right = null;
            }
        }
    }
}
