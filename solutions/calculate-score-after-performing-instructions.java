class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        boolean[] visited = new boolean[values.length];
        long score = 0L;

        int i = 0;

        while (i >= 0 && i < values.length && !visited[i]) {
            visited[i] = true;
            if (instructions[i].equals("add")) {
                score += values[i];
                i++;
            } else {
                i += values[i];
            }
        }

        return score;
    }
}
