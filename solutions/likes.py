def likes(names):
    if len(names) == 0:
        return "no one likes this"
    if len(names) == 1:
        return f"{names[0]} likes this"
    if len(names) == 2:
        return f"{" and ".join(names)} like this"
    if len(names) == 3:
        return f"{", ".join(names[:2])} and {names[-1]} like this"
    if len(names) >= 3:
        return f"{", ".join(names[:2])} and {len(names) - 2} others like this"

    
print(likes([]))
print(likes(["Lucas"]))
print(likes(["Lucas", "Pietro"]))
print(likes(["Lucas", "Pietro", "Fabio"]))
print(likes(["Lucas", "Pietro", "Fabio", "José"]))