class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            
            for (int j = 0; j < points.length; j++) {
                if (calculateDistance(query, points[j]) <= query[2]) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    public static double calculateDistance(int[] pointA, int[] pointB) {
        return Math.sqrt(Math.pow(pointB[0] - pointA[0], 2) + Math.pow(pointB[1] - pointA[1], 2));
    }
}
