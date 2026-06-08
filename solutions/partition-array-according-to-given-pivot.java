class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int lessIndex = 0;
        int greaterIndex = nums.length - 1;

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot) {
                result[lessIndex] = nums[i];
                lessIndex++;
            }

            if (nums[j] > pivot) {
                result[greaterIndex] = nums[j];
                greaterIndex--;
            }
         }

        while (lessIndex <= greaterIndex) {
            result[lessIndex] = pivot;
            lessIndex++;
        }

        return result;
    }
}
