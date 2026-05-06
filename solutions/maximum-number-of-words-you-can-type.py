class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        text_list = text.split()
        count = 0

        for t in text_list:
            t_set = set(t)
            for broken in brokenLetters:
                if broken in t_set:
                    count += 1
                    break 

        return len(text_list) - count
