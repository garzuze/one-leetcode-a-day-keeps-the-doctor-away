import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = sortArray(left);
        right = sortArray(right);
        
        return merge(left, right);
    }

    private int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[i + j] = a[i];
                i++;
            } else {
                c[i + j] = b[j];
                j++;
            }
        }

        while (i < a.length) {
            c[i + j] = a[i];
            i++;
        }

        while (j < b.length) {
            c[i + j] = b[j];
            j++;
        }

        return c;
    }
}
