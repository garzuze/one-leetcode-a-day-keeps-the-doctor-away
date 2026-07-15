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
    public TreeNode invertTree(TreeNode root) {
        invertBinaryTree(root);
        return root;
    }

    public void invertBinaryTree(TreeNode focus) {
        if (focus != null) {
            invertBinaryTree(focus.left);
            invertBinaryTree(focus.right);
            TreeNode temp = focus.left;
            focus.left = focus.right;
            focus.right = temp;
        }
    }
}
