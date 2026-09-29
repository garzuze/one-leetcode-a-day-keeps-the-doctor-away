import java.util.List;
import java.util.ArrayList;

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        char[] str = s.toCharArray();

        backtrack(str, 0);

        return result;
    }

    private void backtrack(char[] str, int i) {
        if (i == str.length) {
            result.add(new String(str));
            return;
        }

        if (!Character.isLetter(str[i])) {
            backtrack(str, i + 1);
            return;
        }
        
        backtrack(str, i + 1);
        str[i] = (char) (str[i] ^ 32);
        backtrack(str, i + 1);
    }
}
