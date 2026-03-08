from typing import List


class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        nums_set = set(nums)

        for n in nums_set:
            if n.replace("0", "1") not in nums_set:
                return n.replace("0", "1")
            elif n.replace("1", "0") not in nums_set:
                return n.replace("1", "0")

        base = "0" * len(nums)

        for i in range(len(nums)):
            if base.replace("0", "1", i) not in nums_set:
                return base.replace("0", "1", i)
        return base
