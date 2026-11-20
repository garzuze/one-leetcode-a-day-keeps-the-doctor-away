import java.util.Arrays;

class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] str = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            str[i] = Integer.toBinaryString(nums[i]);
        }

        Arrays.sort(str, (a, b) -> {
            String one = new StringBuilder(a).append(b).toString();
            String two = new StringBuilder(b).append(a).toString();
            return two.compareTo(one);
        });

        StringBuilder result = new StringBuilder();

        for (String n : str) {
            result.append(n);
        }

        return Integer.parseInt(result.toString(), 2);
    }
}
