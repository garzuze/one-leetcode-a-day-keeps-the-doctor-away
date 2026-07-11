import java.util.List;
import java.util.ArrayList;


class Solution {
    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        this.backtrack("(", 1, 0, n);
        return result;
    }

    private void backtrack(String curr, int countOpen, int countClosed, int n) {
        if (countOpen == n && countClosed == n) {
            this.result.add(curr);
            return;
        }

        if (countOpen < n) {
            this.backtrack(curr + "(", countOpen + 1, countClosed, n);
        }

        if (countClosed < countOpen) {
            this.backtrack(curr + ")", countOpen, countClosed + 1, n);
        }
    }
}
