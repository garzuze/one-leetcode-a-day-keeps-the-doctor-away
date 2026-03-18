from typing import List

class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if len(nums1) > len(nums2):
            return self.intersect(nums2, nums1)

        n1_map = {}
        result = []

        for n in nums1:
            n1_map[n] = n1_map.get(n, 0) + 1
        
        for number in nums2:
            if number in n1_map:
                if n1_map[number] > 0:
                    result.append(number)
                    n1_map[number] -= 1
        
        return result