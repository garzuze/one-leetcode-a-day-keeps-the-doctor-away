from typing import List

class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        types = len(set(candyType))
        can_eat = len(candyType) // 2

        if types == can_eat:
            return can_eat
        
        if types > can_eat:
            return can_eat

        if can_eat > types:
            return types