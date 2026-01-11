from typing import List


class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        count = {}
        biggest_count = float('-inf')
        biggest_num = float('-inf')

        for i in range(1, len(nums)):
            if nums[i - 1] == key:
                count[nums[i]] = count.get(nums[i], 0) + 1

                if count[nums[i]] > biggest_count:
                    biggest_count = count[nums[i]]
                    biggest_num = nums[i]

        return biggest_num
