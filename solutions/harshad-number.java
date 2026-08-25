class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int acc = 0;
        int copy = x;

        while (x > 0) {
            acc += x % 10;
            x /= 10;
        }
        
        if (acc > 0 && copy % acc == 0) {
            return acc;
        }
        
        return -1;
    }
}
