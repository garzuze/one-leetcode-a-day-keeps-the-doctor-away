class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        result = []
        count = {}
        
        for n in nums:
            count[n] = count.get(n, 0) + 1

            if count[n] == 2:
                result.append(n)
        
        return result
