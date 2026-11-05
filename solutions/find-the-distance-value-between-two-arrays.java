class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = arr1.length;
        for (int n1 : arr1) {
            for (int n2 : arr2) {
                if (Math.abs(n1 - n2) <= d) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }
}
