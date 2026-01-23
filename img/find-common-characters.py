class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        final = []
        for letter in set(words[0]):
            count = []
            for word in words:
                count.append(word.count(letter))
            for i in range(min(count)):
                final.append(letter)

        return final
