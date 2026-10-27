class Solution {
    public String[] createGrid(int m, int n) {
        String[] result = new String[m];
        char[] res = new char[n];

        for (int i = 0; i < n; i++) {
            res[i] = '.';
        }

        result[0] = new String(res);
        
        for (int i = 0; i < n; i++) {
            res[i] = '#';
        }
        
        res[n - 1] = '.';
        String finalStr = new String(res);

        for (int i = 1; i < m; i++) {
            result[i] = finalStr;
        }

        return result;
    }
}
