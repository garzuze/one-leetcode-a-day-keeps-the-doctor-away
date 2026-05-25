from typing import List


class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        count = {}

        for n in arr1:
            count[n] = count.get(n, 0) + 1
        
        result = []

        for n in arr2:
            result += [n] * count.get(n)
            del count[n]
        
        for n in sorted(count.keys()):
            result += [n] * count.get(n)
        
        return result
