def rgb(r, g, b):
    rgb_list = [r, g, b]
    result = ''
    for color in rgb_list:
        if color <= 0:
            result += '00'
        elif color > 255:
            result += 'ff'
        else:
            conversion = hex(color).replace('0x', '')
            if len(conversion) == 1:
                result += f'0{conversion}'
            else:
                result += conversion
    return result.upper()


print(rgb(1, 2, 3))
print(rgb(-20, 275, 125))