class Solution {
    public String reverseParentheses(String s) {
        StringBuilder op = new StringBuilder(s);
        int i = op.lastIndexOf("(");
        
        while (i >= 0) {
            if (op.charAt(i) == '(') {
                int j = op.indexOf(")", i + 1);
                String substring = op.substring(i + 1, j);
                // they could do this natively though
                op.replace(i + 1, j, new StringBuilder(substring).reverse().toString());
                op.delete(i, i + 1);
                op.delete(j - 1, j);
                i--;
            }
            while (i >= 0 && op.charAt(i) != '(') {
                i--;
            }
        }

        return op.toString();
    }
}
