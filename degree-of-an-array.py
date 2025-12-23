from typing import List


class Solution:
    def findShortestSubArray(self, nums: List[int]) -> int:
        count = {}
        first = {}
        last = {}
        degree = None
        shortests = []

        for index, num in enumerate(nums):
            count[num] = count.get(num, 0) + 1
            if num not in last:
                first[num] = index

            last[num] = index

            if degree is None:
                degree = count[num]

            if count[num] > degree:
                degree = count[num]

        for num, freq in count.items():
            if freq == degree:
                shortests.append(last[num] - first[num] + 1)

        return min(shortests)

s = Solution()
print(s.findShortestSubArray([1,2,2,3,1]))