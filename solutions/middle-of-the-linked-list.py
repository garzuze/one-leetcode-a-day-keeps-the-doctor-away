from typing import List
# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = head
        length = 0

        while dummy:
            length += 1
            dummy = dummy.next

        middle = (length // 2) + 1

        dummy = head
        length = 0

        while dummy:
            length += 1
            if length + 1 == middle:
                head = dummy.next
                dummy.next = None
            dummy = dummy.next

        return head
