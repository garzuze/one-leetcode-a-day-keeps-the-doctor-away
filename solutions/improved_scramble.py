def scramble(s1, s2):
    occurences = {}
    for letter in s1:
        occurences[letter] = occurences.get(letter, 0) + 1

    for letter in s2:
        if letter in occurences:
            occurences[letter] -= 1
        else:
            return False
        
        if occurences[letter] < 0:
            return False
        
    return True

print(scramble('rkqodlw', 'world'), '==> True')
print(scramble('cedewaraaossoqqyt', 'codewars'), '==> True')
print(scramble('katas', 'steak'), '==> False')
