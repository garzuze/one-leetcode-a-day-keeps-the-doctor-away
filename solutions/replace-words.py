from typing import List


class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        dict_set = set(dictionary)
        result = ""

        for word in sentence.split():
            curr_string = ""
            for ch in word:
                curr_string += ch
                result += ch
                if curr_string in dict_set:
                    break
            result += " "

        return result.strip()
