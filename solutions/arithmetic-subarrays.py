from typing import List


class Solution:
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        subs = []
        result = []

        for i in range(len(l)):
            subs.append(nums[l[i]:r[i] + 1])

        for arr in subs:
            arr.sort()
            diff = None
            last = arr[0]

            for i in range(1, len(arr)):
                if diff is None:
                    diff = last - arr[i]

                if last - arr[i] != diff:
                    result.append(False)
                    break

                last = arr[i]

                if i == len(arr) - 1:
                    result.append(True)

        return result
