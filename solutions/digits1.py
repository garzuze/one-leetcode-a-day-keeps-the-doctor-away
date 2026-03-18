def main(n):
    count_ones = 0
    for number in range(n + 1):
        number_str = str(number)
        if "1" in number_str:
            ones = number_str.count("1")
            count_ones += ones
    return count_ones
print(main(9999))