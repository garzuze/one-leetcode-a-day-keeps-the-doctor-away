class Solution:
    def addDigits(self, num: int) -> int:
        if num <= 9:
            return num
        
        num_list = [int(n) for n in str(num)]
        while True:
            sum_result = sum(num_list)
            if sum_result <= 9:
                return sum_result
            else:
                num_list = [int(n) for n in str(sum_result)]
                continue


s = Solution()
print(s.addDigits(38))
# Beats 100% 👏