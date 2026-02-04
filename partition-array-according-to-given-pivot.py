from typing import List


class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        left = []
        middle = []
        right = []

        for num in nums:
            if num > pivot:
                right.append(num)
            elif num < pivot:
                left.append(num)
            else:
                middle.append(num)

        return left + middle + right
