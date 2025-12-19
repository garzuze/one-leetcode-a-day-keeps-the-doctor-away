from typing import List

class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        formatted = "".join(char.lower() if char.isalpha() or char.isspace() else " " for char in paragraph).split()
        banned_set = set(banned)
        freq = {}

        most_frequent = float('-inf')
        most_frequent_word = ""

        for word in formatted:
            if word not in banned_set:
                freq[word] = freq.get(word, 0) + 1
                if freq[word] > most_frequent:
                    most_frequent = freq[word]
                    most_frequent_word = word
        
        return most_frequent_word