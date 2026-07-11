import java.util.Set;
import java.util.HashSet;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> forbidden = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            forbidden.add(nums[i]);
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode result = dummy;

        while (dummy.next != null) {
            if (forbidden.contains(dummy.next.val)) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return result.next;
    }
}
