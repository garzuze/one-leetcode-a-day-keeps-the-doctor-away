class Solution:
    def minSwaps(self, s: str) -> int:
        balance = 0
        swaps = 0
        right = len(s) - 1
        s_arr = list(s)

        for i in range(len(s_arr)):
            while s[right] != "]":
                right -= 1

            if s_arr[i] == "[":
                balance += 1
            else:
                balance -= 1

            if balance < 0:
                balance = 1
                s_arr[i], s_arr[right] = s_arr[right], s_arr[i]
                swaps += 1

        return swaps
