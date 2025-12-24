class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewel_types = set([ch for ch in jewels])

        count = 0

        for ch in stones:
            if ch in jewel_types:
                count += 1

        return count