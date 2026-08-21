import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> idx = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                idx.add(i);
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > idx.size()) {
                result[i] = -1;
            } else {
                result[i] = idx.get(queries[i] - 1);
            }
        }

        return result;
    }
}