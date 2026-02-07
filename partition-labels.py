from typing import List


class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        last = {}
        count = []
        left, right = 0, 0

        for i in range(len(s)):
            last[s[i]] = i

        while right < len(s):
            partition = last[s[right]]

            while right < partition:
                if last[s[right]] > partition:
                    partition = last[s[right]]
                right += 1

            count.append(right - left + 1)
            left = right + 1
            right = left

        return count
