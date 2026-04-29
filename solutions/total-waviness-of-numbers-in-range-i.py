class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:
        count = 0

        for i in range(num1, num2 + 1):
            str_num = str(i)
            for n in range(1, len(str_num) - 1):
                prev = int(str_num[n - 1])
                curr = int(str_num[n])
                next = int(str_num[n + 1])

                if curr > prev and curr > next:
                    count += 1
                if curr < prev and curr < next:
                    count += 1
        
        return count

