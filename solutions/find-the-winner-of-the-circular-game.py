class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        circle = [i for i in range(1, n + 1)]
        i = k - 1
  
        while len(circle) > 1:
          del circle[i]
          i -= 1
          i = (i + k) % len(circle)
    
        return circle.pop()        
