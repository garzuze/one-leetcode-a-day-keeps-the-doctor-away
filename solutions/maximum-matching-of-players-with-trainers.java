import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int result = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = players.length;
        int t = trainers.length;

        int i = 0;
        int j = 0;

        while (i < p && j < t && players[i] > trainers[j]) {
            j++;
        }

        while (i < p && j < t && players[i] <= trainers[j]) {
            result++;
            i++;
            j++;

            while (i < p && j < t && players[i] > trainers[j]) {
                j++;
            }
        }

        return result;
    }
}
