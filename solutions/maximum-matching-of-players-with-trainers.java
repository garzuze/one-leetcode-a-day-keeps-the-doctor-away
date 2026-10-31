import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int result = 0;
        
        Thread t1 = new Thread(() -> Arrays.sort(players));
        Thread t2 = new Thread(() -> Arrays.sort(trainers));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

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
