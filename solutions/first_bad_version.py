# mocked
def isBadVersion(version: int) -> bool:
    return version == 4

class Solution:
    def firstBadVersion(self, n: int) -> int:
        left = 0
        right = n

        while left <= right:
            middle = (right + left) // 2
            print(middle)
            if isBadVersion(middle) and not isBadVersion(middle - 1):
                return middle
            elif isBadVersion(middle) and isBadVersion(middle - 1):
                # shit left
                right = middle - 1 
            else:
                # shit right
                left = middle + 1
        return left
    
s = Solution()
print(s.firstBadVersion(5))