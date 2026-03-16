from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev = dummy

        while prev.next and prev.next.next:
            temp = prev.next
            temp2 = temp.next

            prev.next = temp2
            temp.next = temp2.next
            temp2.next = temp

            prev = temp

        return dummy.next
