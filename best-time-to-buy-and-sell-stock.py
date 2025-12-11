from typing import List

# for the record: hoje eu to sem luz em casa há umas doze horas. A bateria do meu notebook acabou. Fiz pelo chromebook roteando internet do celular kkkkk

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left, right = 0, 1
        max_profit = 0

        while right < len(prices):
            if prices[right] < prices[left]:
                left = right
            else:
                profit = prices[right] - prices[left]
                max_profit = max(max_profit, profit)
            right += 1

        return max_profit
