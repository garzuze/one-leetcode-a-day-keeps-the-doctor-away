from typing import List
import math

# AKA koko-eating-bananas

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        upper = max(piles)

        if h == len(piles):
            return upper

        lower = 1
        while lower <= upper:
            speed = (upper + lower) // 2
            total_time = 0
            for pile in piles:
                total_time += math.ceil(pile / speed)

            if total_time > h:
                lower = speed + 1
            else:
                upper = speed - 1

        return lower


s = Solution()
piles = [312884470]
h = 312884469

print(s.minEatingSpeed(piles, h))
print(s.minEatingSpeed([25, 10, 23, 4], 4))
print(s.minEatingSpeed([1, 4, 3, 2], 9))
