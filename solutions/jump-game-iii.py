from typing import List


class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        visited = set()
        stack = [start]

        while stack:
            n = stack.pop()
            if n < 0 or n > len(arr) - 1:
                continue 

            if arr[n] == 0:
                return True

            if n not in visited:
                visited.add(n)
                stack.extend([n + arr[n], n - arr[n]])
        
        return False
