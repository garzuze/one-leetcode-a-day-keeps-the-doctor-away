import java.util.Arrays;


class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] copy = score.clone();
        
        Arrays.sort(copy);
        int[] placement = new int[copy[n - 1] + 1];

        for (int i = 0; i < copy.length; i++) {
            placement[copy[i]] = n - i;
        }

        String[] answer = new String[n];

        for (int i = 0; i < score.length; i++) {
            String position = getPosition(placement[score[i]]);
            answer[i] = position;
        }

        return answer;
    }

    private String getPosition(int scr) {
        if (scr == 1) return "Gold Medal";
        if (scr == 2) return "Silver Medal";
        if (scr == 3) return "Bronze Medal";
        
        return String.valueOf(scr);
    }
}
