import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> printVertically(String s) {
        String[] sArr = s.split(" ");
        List<String> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (String str : sArr) {
            max = Math.max(max, str.length());
        }

        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String str : sArr) {
                if (i < str.length()) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            result.add(sb.toString().stripTrailing());
        }

        return result;
        
    }
}
