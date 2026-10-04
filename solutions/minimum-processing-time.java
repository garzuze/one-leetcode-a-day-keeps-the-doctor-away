import java.util.Arrays;
import java.util.List;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int result = 0;
        int pLen = processorTime.size();
        int tLen = tasks.size();

        int[] p = new int[pLen];
        int[] t = new int[tLen];

        for (int i = 0; i < pLen; i++) {
            p[i] = processorTime.get(i);
        }
        
        for (int i = 0; i < tLen; i++) {
            t[i] = tasks.get(i);
        }

        Arrays.sort(p);
        Arrays.sort(t);

        for (int i = 0; i < pLen; i++) {
            int tIdx = tLen - 1 - (i * 4);
            result = Math.max(result, p[i] + t[tIdx]);
        }

        return result;
    }
}
