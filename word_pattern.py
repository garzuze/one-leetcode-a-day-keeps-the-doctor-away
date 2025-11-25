class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern_list = [s for s in pattern]
        s_list = s.split()

        if len(pattern_list) != len(s_list):
            return False

        ch_map = {}
        i = 0
        for i in range(len(pattern_list)):
            if pattern_list[i] not in ch_map.keys() and s_list[i] in ch_map.values():
                return False
            if pattern_list[i] not in ch_map.keys():
                ch_map[pattern_list[i]] = s_list[i]
            else:
                if ch_map[pattern_list[i]] != s_list[i]:
                    return False

        return True
