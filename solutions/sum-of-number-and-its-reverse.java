class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if (num == 0) return true;
        int start = num / 2;

        for (int i = start; i < num; i++) {
            if (i + reverse(i) == num) {
                return true;
            }
        }

        return false;
    }

    private int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + num % 10;
            num /= 10;
        }

        return reversed;
    }
}
