def solution(s):
    if (len(s) % 2) != 0:
        s += "_"
    count = 0
    result = []
    for i in range(len(s)):
        count = count + 1
        if (count % 2) == 0:
            result.append(str(s[i - 1] + s[i]))

    return result


print(solution("asdfads"))
