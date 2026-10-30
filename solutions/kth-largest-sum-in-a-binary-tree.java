import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

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
    private long[] sums;
    public long kthLargestLevelSum(TreeNode root, int k) {
        int len = height(root) + 1;

        if (len < k) return -1;

        sums = new long[len];
        bfs(root);

        Arrays.sort(sums);

        return sums[sums.length - k];
    }

    private void bfs(TreeNode focus) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(focus);
        int i = 0;

        while (!queue.isEmpty()) {
            long sum = 0L;
            int size = queue.size();
            
            for (int j = 0; j < size; j++) {
                TreeNode curr = queue.removeFirst();
                sum += curr.val;

                if (curr.left != null) {
                    queue.addLast(curr.left);
                }
                
                if (curr.right != null) {
                    queue.addLast(curr.right);
                }
            }
            sums[i] = sum;
            i++;
        }
    }

    private int height(TreeNode f) {
        if (f == null) return -1;

        return 1 + Math.max(height(f.left), height(f.right));
    }

}
