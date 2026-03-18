import string

def high(x):
    points = {}
    scores = []
    score = 0
    lowercase_letters = string.ascii_lowercase
    for i in range(0, len(lowercase_letters)):
        points[lowercase_letters[i]] = i + 1
    words = x.split(" ")
    
    for word in words:
        score = 0
        for letter in word:
            score += points[letter]
        scores.append(score)
    return(words[scores.index(max(scores))])


print(high('man i need a taxi up to ubud'))