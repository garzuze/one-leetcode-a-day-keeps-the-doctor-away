import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        char[] str = s.toCharArray();
        List<String> result = new ArrayList<>();
        int i = 0;
        StringBuilder curr = new StringBuilder();

        while (i < str.length) {
            curr.append(str[i]);
            if (!seen.contains(curr.toString())) {
                result.add(curr.toString());
                seen.add(curr.toString());
                curr.setLength(0);
            }
            i++;
        }

        return result;
   }
}
