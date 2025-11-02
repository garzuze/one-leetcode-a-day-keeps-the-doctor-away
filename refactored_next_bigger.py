def next_bigger(n):
    digits = [int(number) for number in str(n)]
    # 2081
    # acha digito mais à direita que é menor do que o seu vizinho à direita
    i = len(digits) - 2
    while i >= 0 and digits[i] >= digits[i + 1]:
        i -= 1

    # Se não tiver, não há um número maior
    if i == -1:
        return -1


    # Achar menor digito à direita de i que é maior do que digits[i]
    j = len(digits) - 1
    while digits[j] <= digits[i]:
        j -= 1

    # troca os dois
    digits[i], digits[j] = digits[j], digits[i]
    digits[i + 1:] = reversed(digits[i + 1:])

    return int(''.join(map(str, digits)))

print(next_bigger(2081))  