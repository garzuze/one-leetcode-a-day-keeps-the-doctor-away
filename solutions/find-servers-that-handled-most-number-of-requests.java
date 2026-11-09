import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

class Server {
    int id = 0;
    int avaliableAt = 0;

    Server(int id, int avaliableAt) {
        this.id = id;
        this.avaliableAt = avaliableAt;
    }
}

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> free = new PriorityQueue<>();
        PriorityQueue<Server> inUse = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a.avaliableAt, b.avaliableAt);
        });
        int[] count = new int[k];


        for (int i = 0; i < k; i++) {
            free.add(i);
        }

        int n = arrival.length;

        for (int i = 0; i < n; i++) {
            while (!inUse.isEmpty() && inUse.peek().avaliableAt <= arrival[i]) {
                int id = inUse.poll().id;
                free.add(i + Math.floorMod(id - i, k));
            }

            if (free.isEmpty()) {
                continue;
            }

            int id = free.poll() % k;
            Server s = new Server(id, arrival[i] + load[i]);
            count[s.id]++;
            inUse.add(s);
        }

        int max = Integer.MIN_VALUE;

        for (int c : count) {
            max = Math.max(max, c);
        }

        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                result.add(i);
            }
        }

        return result;
    }
}
