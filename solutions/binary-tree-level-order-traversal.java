import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> level = new ArrayList();

            for (int i = 0; i < size; i++) {
                TreeNode curr = deque.removeFirst();
                level.add(curr.val);

                if (curr.left != null) {
                    deque.addLast(curr.left);
                }

                if (curr.right != null) {
                    deque.addLast(curr.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}
