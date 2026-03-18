from typing import List


class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        max_triplets = len(piles) // 3
        i = -2
        result = 0

        piles.sort()

        while max_triplets > 0:
            result += piles[i]
            max_triplets -= 1
            i -= 2

        return result