import java.util.List;
import java.util.ArrayList;

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(new ArrayList<>(), nums, 0);

        return result;
    }

    private void backtrack(List<Integer> l, int[] nums, int i) {
        result.add(new ArrayList<>(l));
        for (int j = i; j < nums.length; j++) {
            l.add(nums[j]);
            backtrack(l, nums, j + 1);
            l.remove(l.size() - 1);
        }
    }
}
