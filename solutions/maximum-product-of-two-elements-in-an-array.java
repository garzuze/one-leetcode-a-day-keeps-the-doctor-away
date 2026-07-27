class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int greatest = 0;
        int secondGreatest = 0;

        for (int num : nums) {
            if (num > greatest) {
                secondGreatest = greatest;
                greatest = num;
            } else if (num > secondGreatest) {
                secondGreatest = num;
            }
        }

        return (greatest - 1) * (secondGreatest - 1);
    }
}
