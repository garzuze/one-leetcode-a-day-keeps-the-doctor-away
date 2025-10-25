import re

def top_3_words(text):
    dirty_words= text.split(" ")
    clean_words = []
    for word in dirty_words:
        clean_word = "".join(letter.lower() for letter in word if letter.isalnum() or letter == "'")
        clean_words.append(clean_word)
    words_array = [item for item in clean_words if re.match("^[a-zA-Z']+$", item) and set(item) != {"'"}]
    text_set = set(words_array)

    frequencies = {}
    for word in text_set:
        word = word.replace("\n", "")
        frequencies[word] = words_array.count(word)
    sorted_frequencies = dict(sorted(frequencies.items(), key=lambda item: item[1], reverse=True))
    return list(sorted_frequencies)[:3]

# print(top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"),)
print(top_3_words("  //wont won't won't "),)