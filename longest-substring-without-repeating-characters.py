class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = right = 0
        seen = set()
        window_len = 0
        while right < len(s):
            if s[right] not in seen:
                seen.add(s[right])
                right += 1
                if right - left > window_len:
                    window_len = right - left
            else:
                seen.remove(s[left])
                left += 1
        return window_len

s = Solution()
print(s.lengthOfLongestSubstring("abcabcbb"))