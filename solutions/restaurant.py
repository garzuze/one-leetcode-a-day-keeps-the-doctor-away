def main(orders):
    # {
    #     table: [
    #         {
    #             item: item
    #             quantity: quantity
    #         }
    #     ]
    # }
    organized_orders = {}
    items = []
    for order in orders:
        items.append(order[2])
        organized_orders[order[1]] = {
            order[2]: items.count(order[2]),
        }
    sorted_items = sorted(set(items))
    sorted_orders = dict(sorted(organized_orders.items()))
    final_result = [["Table", *sorted_items]]
    for key, value in sorted_orders.items():
        print(key)
        print(value)
        final_result.append(
            [
                key,
                *[str(value[item]) if item in value else "0" for item in sorted_items],
            ]
        )

    return final_result


print(
    main(
        [
            ["James", "12", "Fried Chicken"],
            ["Ratesh", "12", "Fried Chicken"],
            ["Amadeus", "12", "Fried Chicken"],
            ["Adam", "1", "Canadian Waffles"],
            ["Brianna", "1", "Canadian Waffles"],
        ]
    )
)
