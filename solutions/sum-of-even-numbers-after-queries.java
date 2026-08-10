class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        int acc = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                acc += n;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int prev = nums[query[1]];
            int newOne = prev + query[0];

            if (prev % 2 == 0) {
                if (newOne % 2 != 0) {
                    acc -= prev;
                } else {
                    acc += query[0];
                }
            } else {
                if (newOne % 2 == 0) {
                    acc += newOne;
                }
            }

            nums[query[1]] = newOne;
            result[i] = acc;
            
        }

        return result;
    }
}
