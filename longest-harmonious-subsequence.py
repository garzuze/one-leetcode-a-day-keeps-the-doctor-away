from typing import List

class Solution:
    def findLHS(self, nums: List[int]) -> int:
        freq = {}
        sequences = [0]
        result = 0
        nums_set = set(nums)

        if len(nums_set) == 1:
            return 0

        for i in range(len(nums)):
            freq[nums[i]] = freq.get(nums[i], 0) + 1

        for num in nums_set:
            if num + 1 in freq:
                result = freq.get(num, 0) + freq.get(num + 1, 0)
                sequences.append(result)
        
        return max(sequences)