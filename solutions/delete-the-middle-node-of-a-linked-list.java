class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = head;
        int n = 0;
        
        while (dummy != null) {
            dummy = dummy.next;
            n++;
        }

        if (n == 1) return null;
        
        int mid = n / 2;

        n = 0;

        dummy = head;
        while (dummy != null) {
            if (n + 1 == mid) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
            n++;
        }

        return head;
    }
}
