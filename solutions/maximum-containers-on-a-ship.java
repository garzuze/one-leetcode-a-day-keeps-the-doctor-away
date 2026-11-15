class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cells = n * n;
        int weight = maxWeight / w;

        return Math.min(cells, weight);
    }
}
