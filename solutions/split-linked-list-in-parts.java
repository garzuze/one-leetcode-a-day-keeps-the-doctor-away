// Definition for singly-linked list.
class ListNode {
       int val;
       ListNode next;
       ListNode() {};
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        ListNode dummy = head;
        int size = 0;

        while (dummy != null) {
            size ++;
            dummy = dummy.next;
        }

        int base = Math.floorDiv(size, k);
        int exceeded = size % k;
        int firstOne = base + exceeded;

        dummy = head;
        int i = 0;
        ListNode temp = head;
        int j;

        while (i < exceeded) {
            j = 0;
            while (j < base) {
                dummy = dummy.next;
                j++;
            }
            result[i] = temp;
            if (dummy == null) {
                return result;
            }
            temp = dummy.next;
            dummy.next = null;
            dummy = temp;
            i++;
        }

        while (dummy != null) {
            result[i] = dummy;
            j = 0;
            while (dummy != null && j < base - 1) {
                dummy = dummy.next;
                j++;
            }

            if (dummy != null) {
                temp = dummy.next;
                dummy.next = null;
                dummy = temp;
            }
            i++;                
        }

        return result;
    }
}
