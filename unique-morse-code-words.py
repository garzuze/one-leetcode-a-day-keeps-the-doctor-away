from typing import List
import string

# Beats 100%
# acho que essa foi a solução mais rápida que eu já escrevi na minha vida
class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        codes = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        letters = lowercase_list = list(string.ascii_lowercase)

        dictionary = {}
        for i in range(len(codes)):
            dictionary[letters[i]] = codes[i]

        morse_words = set()
        for word in words:
            morse_word = ""
            for letter in word:
                morse_word += dictionary[letter]
            morse_words.add(morse_word)

        
        return len(morse_words)