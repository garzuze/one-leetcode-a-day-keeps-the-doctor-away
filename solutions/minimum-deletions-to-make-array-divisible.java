import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        Map<Integer, Integer> count = new TreeMap<>();
        Set<Integer> numsDivideSet = new HashSet<>();

        for (int n : numsDivide) {
            min = Math.min(min, n);
            numsDivideSet.add(n);
        }
        
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getKey() > min) {
                return -1;
            } else {
                if (!canDivide(numsDivideSet, entry.getKey())) {
                    result += entry.getValue();
                } else {
                    return result;
                }
            }

        }
        
        return -1;
    }

    private boolean canDivide(Set<Integer> numsSet, int n) {
        if (n == 0) return false;

        for (Integer num : numsSet) {
            if (num % n != 0) {
                return false;
            }
        }

        return true;
    }
}
