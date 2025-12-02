from typing import List

# Migué do caralho kkkkkkkkkkkkkk
class Solution:

    def encode(self, strs: List[str]) -> str:
        # empty list -> one thing; list with one empty character -> another
        if strs == []:
            return ""
        if strs == ['']:
            return "list_empty_string"
        return "|".join(strs)

    def decode(self, s: str) -> List[str]:
        if s == "":
            return []
        elif s == "list_empty_string":
            return [""]
        return s.split("|")


s = Solution()
encode = s.encode([""])
print(encode)
print(s.decode(encode))
