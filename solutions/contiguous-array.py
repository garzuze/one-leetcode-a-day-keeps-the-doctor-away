from typing import List



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i] == 0:
                nums[i] = -1
            
        curr_sum = 0
        prefix_sum = {0: 1}
        contiguous = set()
        contiguous.add(0)

        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum == 0:
                contiguous.add(i + 1)
            
            if curr_sum in prefix_sum:
                contiguous.add(i - prefix_sum[curr_sum])
            
            if curr_sum not in prefix_sum:
                prefix_sum[curr_sum] = i

        return max(contiguous)
