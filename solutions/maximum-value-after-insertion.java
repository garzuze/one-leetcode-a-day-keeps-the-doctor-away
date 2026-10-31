class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb = new StringBuilder(n);
        int l = n.length();
        int i = 0;

        if (sb.charAt(i) == '-') {
            i = 1;
            while (i < l && (int) (sb.charAt(i) - '0') <= x) {
                i++;
            }
            sb.insert(i, x);
        } else {
            while (i < l && (int) (sb.charAt(i) - '0') >= x) {
                i++;
            }
            sb.insert(i, x);
        }

        return sb.toString();
    }
}
