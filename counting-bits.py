from typing import List


class Solution:
    def countBits(self, n: int) -> List[int]:
        return [bin(number)[2:].count("1") for number in range(n + 1)]
