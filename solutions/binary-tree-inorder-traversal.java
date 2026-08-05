import java.util.List;
import java.util.ArrayList;


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
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return result;
    }
    
    private void traverse(TreeNode focus) {
        if (focus != null) {
            traverse(focus.left);
            result.add(focus.val);
            traverse(focus.right);
        }
    }

}
