class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int cap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > cap) {
                cap = capacity;
                steps += 2 * i;
            }
            cap -= plants[i];
            steps++;
        }

        return steps;
    }
}
