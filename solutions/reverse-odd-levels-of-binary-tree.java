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
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left, root.right, 1);
        return root;
    }

    public void reverse(TreeNode nodeOne, TreeNode nodeTwo, int level) {
        if (nodeOne == null || nodeTwo == null) {
            return;
        }
        if (level % 2 != 0) {
            int temp = nodeOne.val;
            nodeOne.val = nodeTwo.val;
            nodeTwo.val = temp;
        }
        reverse(nodeOne.left, nodeTwo.right, level + 1);
        reverse(nodeOne.right, nodeTwo.left, level + 1);
    }
}
