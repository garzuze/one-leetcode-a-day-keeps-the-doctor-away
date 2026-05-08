from typing import List


class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        n = {}
        result = []
        
        for i, height in enumerate(heights):
            n[height] = names[i]
        

        for height in sorted(n.keys(), reverse=True):
            result.append(n[height])
        
        return result
