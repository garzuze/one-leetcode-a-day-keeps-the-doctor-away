from typing import List



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        result = 0
        prefix_sum = {0: -1}
        count = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count -= 1
            
            if count in prefix_sum:
                result = max(result, i - prefix_sum[count])
            else:
                prefix_sum[count] = i

        return result
