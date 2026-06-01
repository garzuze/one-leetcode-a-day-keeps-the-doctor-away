class Solution:
    def intToRoman(self, num: int) -> str:
        result = []
        
        for val, rep in self.int_map.items():
            while num >= val: 
              result.append(self.int_map[val] * (num // val))
              num %= val

        return "".join(result)
  
    int_map = {
      1000:'M', 
      900:'CM', 
      500:'D', 
      400: 'CD', 
      100:'C', 
      90:'XC', 
      50:'L', 
      40:'XL', 
      10:'X', 
      9:'IX', 
      5:'V', 
      4:'IV', 
      1:'I'
    }