import string

class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        subs = {" ": " "}
        alphabet = string.ascii_lowercase
        key = key.replace(" ", "")
        i = 0

        for ch in key:
          if ch not in subs:
            subs[ch] = alphabet[i]
            i += 1

        result = ""

        for ch in message:
            result += subs[ch]
        
        return result