class Solution:
    def customSortString(self, order: str, s: str) -> str:
        order_map = {}
        for i in range(len(order)):
            order_map[order[i]] = i

        result_list = sorted(list(s), key=lambda x: order_map.get(x, float('inf')))

        return "".join([r for r in result_list])
