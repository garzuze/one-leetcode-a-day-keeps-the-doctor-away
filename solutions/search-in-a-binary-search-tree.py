from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right



class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        dummy = root

        while dummy:
            if dummy.val == val:
                return dummy
            elif dummy.val < val:
                dummy = dummy.right
            else:
                dummy = dummy.left
        
        return None