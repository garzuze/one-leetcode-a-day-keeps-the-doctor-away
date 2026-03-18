from typing import List


class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        greater_map = {}
        greater_stack = []

        for i in range(len(nums2) - 1, -1, -1):
            while greater_stack and greater_stack[-1] <= nums2[i]:
                greater_stack.pop()

            if greater_stack:
                greater_map[nums2[i]] = greater_stack[-1]
            else:
                greater_map[nums2[i]] = -1
            
            greater_stack.append(nums2[i])


        return [greater_map[num] for num in nums1]

s = Solution()
print(s.nextGreaterElement([4, 1, 2], [1, 3, 4, 2]))
print(s.nextGreaterElement([1, 3, 5, 2, 4], [6,5,4,3,2,1,7]))
