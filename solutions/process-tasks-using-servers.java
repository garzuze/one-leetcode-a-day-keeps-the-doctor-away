import java.util.Arrays;
import java.util.PriorityQueue;

class Server {
    public int weight = 0;
    public int idx = 0;
    public int avaliableAt = 0;

    Server(int weight, int idx, int avaliableAt) {
        this.weight = weight;
        this.idx = idx;
        this.avaliableAt = avaliableAt;
    } 
    
}

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = tasks.length;
        int[] result = new int[n];

        if (servers.length == 1) {
            Arrays.fill(result, 0);
            return result;
        }
        int t = 0;
        PriorityQueue<Server> aval = new PriorityQueue<>((a, b) -> {
            if (a.weight == b.weight) {
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.weight, b.weight);
        });

        for (int i = 0; i < servers.length; i++) {
            aval.offer(new Server(servers[i], i, 0));
        }

        PriorityQueue<Server> inUse = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a.avaliableAt, b.avaliableAt);
        });

        int i = 0;

        while (i < n) {
            while (!aval.isEmpty() && i < n && i <= t) {
                Server s = aval.poll();
                s.avaliableAt = t + tasks[i];
                result[i] = s.idx;
                inUse.offer(s);
                i++;
            }
            t++;
            if (aval.isEmpty()) {
                Server s = inUse.poll();
                t = s.avaliableAt;
                aval.offer(s);
            }
            
            while (!inUse.isEmpty() && inUse.peek().avaliableAt == t) {
                Server s = inUse.poll();
                aval.offer(s);
            }
        }

        return result;
    }
}
