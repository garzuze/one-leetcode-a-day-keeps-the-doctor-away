import java.util.Map;
import java.util.TreeMap;

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
    private Map<Integer, Long> sum = new TreeMap<>();

    public int maxLevelSum(TreeNode root) {
        traverse(root, 1);
        Long maxSum = Long.MIN_VALUE;

        for (Map.Entry<Integer, Long> entry : sum.entrySet()) {
            maxSum = Math.max(maxSum, entry.getValue());
        }

        for (Map.Entry<Integer, Long> entry : sum.entrySet()) {
            if (entry.getValue().equals(maxSum)) {
                return entry.getKey();
            }
        }

        return 1;
    }

    private void traverse(TreeNode focus, int level) {
        if (focus != null) {
            sum.put(level, sum.getOrDefault(level, 0L) + focus.val);
            traverse(focus.left, level + 1);
            traverse(focus.right, level + 1);
        }
    }
}