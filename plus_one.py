# works but it's pretty uggly

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        number_str = ""
        for digit in digits:
            number_str += str(digit)
        number_int = int(number_str)
        new_number = number_int + 1
        return [int(i) for i in str(new_number)]