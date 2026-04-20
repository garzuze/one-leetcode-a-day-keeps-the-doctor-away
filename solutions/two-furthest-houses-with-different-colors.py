from typing import List


class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        left = 0
        right = len(colors) - 1
        max_distance = 0

        while left < right:
            if colors[left] != colors[right]:
                max_distance = abs(left - right)
                break
            right -= 1
        
        right = len(colors) - 1

        while left < right:
            if colors[left] != colors[right]:
                max_distance = max(max_distance, abs(left - right))
            left += 1

        return max_distance
