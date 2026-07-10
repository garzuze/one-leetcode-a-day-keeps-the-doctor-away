/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode first = null;
        ListNode last = null;
        int i = 1;

        while (i != k) {
            fast = fast.next;
            i++;
        }

        first = fast;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        last = slow;
        
        int temp = first.val;
        first.val = last.val;
        last.val = temp;

        return head;
    }
}
