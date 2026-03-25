from typing import List



class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix_sum = {}
        count = 0
        curr_sum = 0

        prefix_sum[0] = 1

        for i in range(len(nums)):
            curr_sum += nums[i]
            
            if curr_sum - k in prefix_sum:
                count += 1 * prefix_sum.get(curr_sum - k)
            
            prefix_sum[curr_sum] = prefix_sum.get(curr_sum, 0) + 1
            

        return count
