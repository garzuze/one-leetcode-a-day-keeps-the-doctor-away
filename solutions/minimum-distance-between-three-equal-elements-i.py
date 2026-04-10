from typing import List



class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return -1
        
        appearences = {}

        for i, num in enumerate(nums):
            if num not in appearences:
                appearences[num] = []
            appearences[num].append(i)
        
        distances = set()

        for app in appearences.values():
            if len(app) >= 3:
                for i in range(len(app) - 2):
                    dist = 2 * (app[i + 2] - app[i])
                    distances.add(dist)
        
        return min(distances) if len(distances) > 0 else -1
