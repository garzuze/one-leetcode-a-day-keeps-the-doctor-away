def generate_hashtag(s):
    text = f'#{s.strip().title().replace(" ", "")}'
    if len(text) > 140:
        return False
    return text
