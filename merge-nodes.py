from typing import Optional
# fiz esse no celular e na praia kkkk

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        dummy = ListNode()
        result = dummy
        curr_sum = 0
      
        while curr.next:
            curr_sum += curr.val
            if curr.next.val == 0:
                new_node = ListNode(curr_sum)
                curr_sum = 0
                dummy.next = new_node
                dummy = dummy.next
                
            curr = curr.next
            
        return result.next
