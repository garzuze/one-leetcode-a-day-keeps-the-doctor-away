import java.util.Set;
import java.util.HashSet;

class Solution {
    public int minimumSum(int n, int k) {
        int result = 0;
        Set<Integer> seen = new HashSet<>();
        int j = 0;
        int i = 1;

        while (j < n) {
            if (seen.contains(k - i)) {
                i++;
                continue;
            }
            seen.add(i);
            result += i;
            i++;
            j++;
        }

        return result;
    }
}
