from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = head

        while dummy.next:
            greatest = self._get_greatest_common_divisor(dummy.val, dummy.next.val)
            new_node = ListNode(greatest, dummy.next)
            dummy.next = new_node
            dummy = dummy.next.next

        return head

    def _get_greatest_common_divisor(self, a: int, b: int) -> int:
        if a > b:
            self._get_greatest_common_divisor(b, a)

        for i in range(a, -1, -1):
            if b % i == 0 and a % i == 0:
                return i

        return 1
