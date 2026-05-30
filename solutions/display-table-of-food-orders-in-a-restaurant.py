from typing import List


class Solution:
    def displayTable(self, orders: List[List[str]]) -> List[List[str]]:
        table_orders = {}
        foods = set()

        for order in orders:
            t = int(order[1]) # table
            f = order[2] # food
            if t not in table_orders:
                table_orders[t] = {}
            table_orders[t][f] = table_orders[t].get(f, 0) + 1
            foods.add(f)

        result = []
        
        header = ["Table"]
        
        for f in sorted(foods):
            header.append(f)
        
        result.append(header)

        for t in sorted(table_orders.keys()):
            row = []
            row.append(str(t))

            for f in sorted(foods):
                row.append(str(table_orders[t].get(f, 0)))
            
            result.append(row)

        return result
