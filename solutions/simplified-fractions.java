import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (i < j && getGcd(i, j) == 1) {
                    sb.setLength(0);
                    sb.append(i);   
                    sb.append("/");
                    sb.append(j);
                    result.add(sb.toString());
                }
            }
        }

        return result;
    }


    private int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
