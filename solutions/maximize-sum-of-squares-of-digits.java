class Solution {
    public String maxSumOfSquares(int num, int sum) {
        char[] result = new char[num];
        int i = 0;

        while (i < num) {
            int curr = Math.min(9, sum);
            sum -= curr;
            result[i] = (char) (curr + '0');
            i++;
        }

        if (sum > 0) {
            return "";
        }

        return new String(result);
    }
}
