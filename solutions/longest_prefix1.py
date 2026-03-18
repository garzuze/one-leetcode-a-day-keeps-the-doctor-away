def longestCommonPrefix(strs):
    """
    :type strs: List[str]
    :rtype: str
    """
    shortest_word = min(strs, key=len)
    prefix = []
    for index, letter in enumerate(shortest_word):
        for word_index, word in enumerate(strs):
            if word[index] != letter:
                return "".join(prefix)
            elif word[index] == letter and word_index == (len(strs) - 1):
                prefix.append(letter)
            
    return "".join(prefix)

print(longestCommonPrefix(["car", "cir"]))