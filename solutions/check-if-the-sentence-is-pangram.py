class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return len(set("thequickbrownfoxjumpsoverthelazydog")) == len(set(sentence))
