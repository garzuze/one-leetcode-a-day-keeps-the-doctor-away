class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[] {-1, -1};

        ListNode dummy = head;
        int prev = dummy.val;

        dummy = dummy.next;
        int i = 1;
        int first = -1;
        int minDis = Integer.MAX_VALUE;
        int last = -1;

        while (dummy.next != null) {
            i++;
            if (
                (dummy.val > prev && dummy.val > dummy.next.val) || 
                (dummy.val < prev && dummy.val < dummy.next.val)
                ) {
                    if (first == -1) {
                        first = i;
                    }

                    if (last != -1) {
                        minDis = Math.min(minDis, i - last);
                    }

                    last = i;
            }
            prev = dummy.val;
            dummy = dummy.next;
        }

        if (first != -1 && minDis > 0 && last - first > 0) {
            result[0] = minDis;
            result[1] = last - first;
        }

        return result;
    }
}
