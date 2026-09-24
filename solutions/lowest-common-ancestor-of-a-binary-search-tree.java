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
    List<TreeNode> seenP = new ArrayList();
    List<TreeNode> seenQ = new ArrayList();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root, p, seenP);
        search(root, q, seenQ);

        for (int i = seenP.size() - 1; i >= 0; i--) {
            for (int j = seenQ.size() - 1; j >= 0; j--) {
                if (seenQ.get(j) == seenP.get(i)) {
                    return seenQ.get(j);
                }
            }
        }

        return null;
    }

    private boolean search(TreeNode root, TreeNode target, List<TreeNode> seen) {
        if (root == null || target == null) return false;
        seen.add(root);
        
        if (root.val > target.val) {
            return search(root.left, target, seen);
        }

        if (root.val < target.val) {
            return search(root.right, target, seen);
        }

        return true;
    }
}
