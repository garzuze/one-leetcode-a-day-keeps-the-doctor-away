class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {
            StringBuilder newOne = new StringBuilder();
            
            for (int i = 0; i < sb.length(); i += k) {
                int end = Math.min(sb.length(), i + k);
                String sub = sb.substring(i, end);

                int acc = 0;
                
                for (char ch : sub.toCharArray()) {
                    int digit = (int) (ch - '0');
                    acc += digit;
                }
                
                newOne.append(acc);
            }
            sb = newOne;
        }

        return sb.toString();
    }


}
