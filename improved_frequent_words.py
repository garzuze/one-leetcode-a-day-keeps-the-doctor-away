import re

def top_3_words(text):
    words = re.findall(r"[a-zA-Z']+", text.lower())
    words = [word for word in words if word.strip("'")]
    frequencies = {}
    for word in words:
        frequencies[word] = frequencies.get(word, 0) + 1
    sorted_frequencies = sorted(frequencies.items(), key=lambda item: item[1], reverse=True)
    return [word for word, count in sorted_frequencies[:3]]
print(top_3_words("e '''' e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"),)
print(top_3_words("  //wont won't won't "),)