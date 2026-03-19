class Solution:
    def frequencySort(self, s: str) -> str:
        freq_map = {}
        s_list = list(s)
        result = ""

        for ch in s_list:
            freq_map[ch] = freq_map.get(ch, 0) + 1

        keys_list = list(freq_map.keys())
        keys_list.sort(key=lambda x: freq_map.get(x), reverse=True)

        for ch in keys_list:
            result += ch * freq_map[ch]

        return result
