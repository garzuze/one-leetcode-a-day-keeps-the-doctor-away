from typing import List


class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        greater_map = {}
        result = []
        can_be = []

        j = len(nums2) - 1
        greater_map[nums2[j]] = -1

        for i in range(len(nums2) - 2, -1, -1):
            can_be.append(nums2[j])

            while can_be[-1] <= nums2[i]:
                can_be.pop()
                if len(can_be) == 0:
                    break
            
            if len(can_be) == 0:
                greater_map[nums2[i]] = -1
            else:
                greater_map[nums2[i]] = can_be[-1]
            
            j -= 1


        for num in nums1:
            result.append(greater_map[num])

        return result


s = Solution()
print(s.nextGreaterElement([4, 1, 2], [1, 3, 4, 2]))
print(s.nextGreaterElement([1, 3, 5, 2, 4], [6,5,4,3,2,1,7]))
