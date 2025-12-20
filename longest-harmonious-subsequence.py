from typing import List

class Solution:
    def findLHS(self, nums: List[int]) -> int:
        freq = {}

        for i in range(len(nums)):
            freq[nums[i]] = freq.get(nums[i], 0) + 1

        result = 0
        for key in freq.keys():
            if key + 1 in freq:
                sequence = freq.get(key) + freq.get(key + 1)
                if sequence > result:
                    result = sequence
        
        return result