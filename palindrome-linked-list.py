from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        values = []
        while head:
            values.append(head.val)
            head = head.next

        values_len = len(values)
        j = values_len
        for i in range(values_len):
            j -= 1
            if values[i] != values[j]:
                return False
        return True
