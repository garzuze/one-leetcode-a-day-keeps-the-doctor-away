from typing import List

class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if len(nums) == 0:
            return []
        elif len(nums) == 1:
            return [str(nums[0])]
        ranges = []
        first = nums[0]
        last = nums[0]
        last_index = len(nums) - 1
        for i, n in enumerate(nums):
            expected = n + 1
            if i != last_index:
                if nums[i + 1] == expected:
                    last = expected
                else:
                    if last == first:
                        ranges.append(str(last))
                    else:
                        ranges.append(f'{first}->{last}')
                    first = nums[i + 1]
                    last = nums[i + 1]
            else:
                expected = n - 1
                if nums[i - 1] == expected:
                    ranges.append(f'{first}->{last}')
                else:
                    ranges.append(str(n))
        return ranges
