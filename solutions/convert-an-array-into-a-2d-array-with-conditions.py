class Solution:
    def findMatrix(self, nums: list[int]) -> list[list[int]]:
        count = {}
        result = [[]]

        for n in nums:
            count[n] = count.get(n, 0) + 1

            if len(result) < count[n]:
                result.append([])
            result[count[n] - 1].append(n)
        
        return result
