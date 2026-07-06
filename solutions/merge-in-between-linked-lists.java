// Definition for singly-linked list.

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = list1;
        int i = 0;

        while (i != a - 1) {
            dummy = dummy.next;
            i++;
        }

        ListNode left = dummy;
        
        while (i != b + 1) {
            dummy = dummy.next;
            i++;
        }

        ListNode right = dummy;
        left.next = list2;

        dummy = list2;

        while (dummy.next != null) {
            dummy = dummy.next;
        }

        dummy.next = right;

        return list1;
    }
}
