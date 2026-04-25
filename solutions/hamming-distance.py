class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        bin_rep_x = bin(x).replace("b", "")
        bin_rep_y = bin(y).replace("b", "")

        diff = abs(len(bin_rep_x) - len(bin_rep_y))

        if len(bin_rep_x) < len(bin_rep_y):
            bin_rep_x = ("0" * diff) + bin_rep_x
        else:
            bin_rep_y = ("0" * diff) + bin_rep_y
        
        count = 0

        for i in range(len(bin_rep_y)):
            if bin_rep_y[i] != bin_rep_x[i]:
                count += 1
            
        return count
