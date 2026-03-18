# return masked string
def maskify(cc):
    if len(cc) <= 4:
        return cc
    final_str = ""
    for _ in range(len(cc)-4):
        final_str += "#"
    final_str += cc[-4:]
    return final_str

print(maskify(''))
print(maskify('abc'))
print(maskify('abcdefg'))