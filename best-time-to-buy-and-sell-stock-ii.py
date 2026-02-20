from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left, right = 0, 1
        profit = 0

        while right < len(prices):
            if prices[left] > prices[right]:
                left = right
            elif prices[right] > prices[left]:
                profit += prices[right] - prices[left]
                left = right

            right += 1

        return profit
