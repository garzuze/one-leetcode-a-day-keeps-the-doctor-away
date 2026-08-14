class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int closed = 0;

        for (char p : s.toCharArray()) {
            if (p == '(') {
                open++;
            } else if (p == ')' && open > 0) {
                open--;
            } else {
                closed++;
            }
        }

        return open + closed;
    }
}
