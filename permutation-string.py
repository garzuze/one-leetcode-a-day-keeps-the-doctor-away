class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_len = len(s1)
        window = 0
        occur = {}
        right = 0

        for ch in s1:
            occur[ch] = occur.get(ch, 0) + 1

        backup = occur.copy()

        while right < len(s2):
            if s2[right] in occur and occur[s2[right]] > 0:
                window += 1
                occur[s2[right]] -= 1
                if window == s1_len:
                    return True
            elif (
                window > 0
                and s2[right] not in occur
                or s2[right] in occur
                and occur[s2[right]] == 0
            ):
                right -= window
                window = 0
                occur = backup.copy()

            right += 1

        return set(occur.values()) == {0}


s = Solution()
print(s.checkInclusion("abc", "lecaabee"))
