def main(prices):
    if sorted(prices) == prices:
        return prices [-1] - prices[0]
    elif sorted(prices, reverse=True) == prices:
        return 0
    else:
        profits = []
        for month, current_price in enumerate(prices):
            profits.append([price - current_price for price in prices[month + 1:]])
        flatened_profits = [item for sublist in profits for item in sublist]
        sorted_profits = sorted(flatened_profits)
        return sorted_profits[-1] + sorted_profits[-2]

print(main([3,3,5,0,0,3,1,4]))