def open_or_senior(data):
    categories_of_members = []
    for potential_member in data:
        if potential_member[0] >= 55 and potential_member[1] > 7:
            categories_of_members.append("Senior")
        else:
            categories_of_members.append("Open")
    return categories_of_members

print(open_or_senior([[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]))