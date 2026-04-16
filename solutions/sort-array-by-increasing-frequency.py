from typing import List



class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        freq = {}

        for num in set(nums):
            n_count = nums.count(num)
            if n_count not in freq:
                freq[n_count] = []

            freq[n_count].append(num)

        result = []

        order = sorted(freq.keys())

        for count in order:
            freq[count].sort(reverse=True)
            for num in freq[count]:
                result += [num] * count
        
        return result

