from typing import List


class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        stack = []
        idx = 0
        
        for i in range(1, n + 1):
            if idx >= len(target):
                break
            if i == target[idx]:
                stack.append("Push")
                idx += 1
            else:
                stack.extend(["Push", "Pop"])
            
        return stack
