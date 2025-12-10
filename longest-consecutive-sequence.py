from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        seen = set()
        possible = []
        sequences = []
        for num in nums:
            seen.add(num)
            if num - 1 not in seen:
                possible.append(num)


        for poss in possible:
            count = 1
            expected = poss + 1
            while expected in seen:
                count += 1
                expected += 1
            
            sequences.append(count)

        return max(sequences)