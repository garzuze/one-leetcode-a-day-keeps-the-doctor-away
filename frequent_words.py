def top_3_words(text):
    dirty_words= text.split()
    clean_words = []
    for word in dirty_words:
        clean_word = "".join(letter.lower() for letter in word if letter.isalpha() or letter == "'")
        clean_words.append(clean_word)

    words_array = [item for item in clean_words if item and set(item) != {"'"}]

    frequencies = {}
    for word in words_array:
        frequencies[word] = frequencies.get(word, 0) + 1
    sorted_frequencies = sorted(frequencies.items(), key=lambda item: item[1], reverse=True)
    return [word for word, count in sorted_frequencies[:3]]

# print(top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"),)
print(top_3_words("  //wont won't won't "),)