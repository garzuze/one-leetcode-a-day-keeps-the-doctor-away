import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> stringSequence(String target) {
        List<String> r = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            char targetChar = target.charAt(i);
            char curr = 'a';
            sb.append(curr);
            r.add(sb.toString());

            while (curr != targetChar) {
                curr++;
                sb.setCharAt(i, curr);
                r.add(sb.toString());
            }
        }

        return r;
    }
}
