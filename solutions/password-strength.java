class Solution {
    public int passwordStrength(String password) {
        boolean[] seenLower = new boolean[26];
        boolean[] seenUpper = new boolean[26];
        boolean[] seenNum = new boolean[10];
        boolean[] seenSpecial = new boolean[4];

        int points = 0;

        for (char ch : password.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && !seenLower[ch - 'a']) {
                seenLower[ch - 'a'] = true;
                points ++;
            } else if (ch >= 'A' && ch <= 'Z' && !seenUpper[ch - 'A']) {
                seenUpper[ch - 'A'] = true;
                points += 2;
            } else if (ch >= '0' && ch <= '9' && !seenNum[ch - '0']) {
                seenNum[ch - '0'] = true;
                points += 3;
            } else {
                if (!seenSpecial[0] && ch == '!') {
                    seenSpecial[0] = true;
                    points += 5;
                } else if (!seenSpecial[1] && ch == '@') {
                    seenSpecial[1] = true;
                    points += 5;
                } else if (!seenSpecial[2] && ch == '#') {
                    seenSpecial[2] = true;
                    points += 5;
                } else if (!seenSpecial[3] && ch == '$') {
                    seenSpecial[3] = true;
                    points += 5;
                }
            }
        }

        return points;
    }
}
