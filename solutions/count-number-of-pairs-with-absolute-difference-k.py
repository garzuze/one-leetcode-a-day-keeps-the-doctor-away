class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        count = {}
        result = 0
        
        for num in nums:
            count[num] = count.get(num, 0) + 1
        
        for num in nums:
            if num - k in count:
                result  += count.get(num - k)
        
        return result
