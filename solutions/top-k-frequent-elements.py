from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        for n in nums:
            freq[n] = freq.get(n, 0) + 1
        
        sorted_freq = dict(sorted(freq.items(), key=lambda item: item[1]))
        return list(sorted_freq)[-k:]

s = Solution()
print(s.topKFrequent([1,1,1,2,2,3, 1, 1, 1, 1, 1,], 2))