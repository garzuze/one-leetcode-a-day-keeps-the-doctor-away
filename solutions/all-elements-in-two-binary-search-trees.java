import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);

        Collections.sort(result);

        return result;
    }

    private void traverse(TreeNode focus) {
        if (focus != null) {
            result.add(focus.val);
            traverse(focus.left);
            traverse(focus.right);
        }
    }
}
