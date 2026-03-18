from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        major_element = majority = 0

        for n in nums:
            if majority == 0:
                major_element = n

            if n == major_element:
                majority += 1
            else:
                majority -= 1

        return major_element
