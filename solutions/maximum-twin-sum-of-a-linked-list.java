import java.util.List;
import java.util.ArrayList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public int pairSum(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        ListNode dummy = head;

        while (dummy != null) {
            nums.add(dummy.val);
            dummy = dummy.next;
        }

        int left = 0;
        int right = nums.size() - 1;
        int result = 0;

        while (left < right) {
            result = Math.max(result, nums.get(left) + nums.get(right));
            left++;
            right--;
        }

        return result;
    }
}
