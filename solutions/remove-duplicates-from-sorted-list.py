# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        final = ListNode(0, head)
        dummy = final
        prev = set()
        while dummy and dummy != None:
            while dummy.next and dummy.next.val in prev:
                dummy.next = dummy.next.next
            if (dummy.next != None):
                prev.add(dummy.next.val)

            dummy = dummy.next
        
        return final.next


# 0 ms beats 100% 👏👏👏 