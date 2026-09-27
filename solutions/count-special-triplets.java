import java.util.Map;
import java.util.HashMap;

class Solution {
    final int MOD = 1000000007;
    public int specialTriplets(int[] nums) {
        Map<Integer, Integer> r = new HashMap<>();
        Map<Integer, Integer> l = new HashMap<>();
    
        long result = 0L;
        for (int x : nums) {
            r.put(x, r.getOrDefault(x, 0) + 1);
        }
        
        for (int x : nums) {
            int before = l.getOrDefault(x * 2, 0);
            l.put(x, l.getOrDefault(x, 0) + 1);
            int after = r.getOrDefault(x * 2, 0) - l.getOrDefault(x * 2, 0);
            result =  (result + (long) before * after) % MOD;
        }
        
        return (int) result;
    }
}
