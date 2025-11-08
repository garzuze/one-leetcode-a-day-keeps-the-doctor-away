class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profits = set()
        if prices == sorted(prices):
            return prices[-1] - prices[0]
        elif prices == sorted(prices, reverse=True):
            return 0
        for i in range(len(prices) - 1, -1, -1):
            price = prices[i]
            for j in range(i - 1, -1, -1):
                diff = price - prices[j]
                if diff not in profits and diff > 0:
                    profits.add(diff)

        return sorted(list(profits))[-1]

s = Solution()
print(s.maxProfit([1,4,11,7,2]))