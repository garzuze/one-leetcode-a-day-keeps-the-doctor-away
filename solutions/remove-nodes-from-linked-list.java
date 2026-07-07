class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode reversed = this.reverse(head);
        ListNode dummy = reversed;
        
        while (dummy != null) {
            while (dummy.next != null && dummy.next.val < dummy.val) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return reverse(reversed);
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
}
