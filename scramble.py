def scramble(s1, s2):
    for letter in s2:
        if letter in s1:
            s1 = s1.replace(letter, "", 1)
            continue
        return False
    
    return True

print(scramble('uwnffhpqgdqt', 'qqwfpw'))