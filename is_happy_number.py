class Solution:
    count = 0
    def isHappy(self, n: int) -> bool:
        sum = 0
        if self.count > 10:
            return False
        for number in str(n):
            sum += int(number) ** 2
        if sum == 1:
            return True
        else:
            self.count += 1
            return self.isHappy(sum)

# Beats 100.00% 👏👏👏
# solução cagada da porra kkkkkkk