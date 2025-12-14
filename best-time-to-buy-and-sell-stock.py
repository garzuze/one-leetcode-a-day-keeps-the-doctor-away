from typing import List

# for the record: hoje eu to sem luz em casa há umas doze horas. A bateria do meu notebook acabou. Fiz pelo chromebook roteando internet do celular kkkkk

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left, right = 0, 1
        profit = 0
        while right < len(prices):
            if prices[right] < prices[left]:
                left = right

            if prices[right] - prices[left] > profit:
                profit = prices[right] - prices[left]
            
            right += 1

        return profit
