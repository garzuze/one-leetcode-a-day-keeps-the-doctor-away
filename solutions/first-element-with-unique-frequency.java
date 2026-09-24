class Solution {
    public int firstUniqueFreq(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            max = Math.max(max, n);
        }

        int[] freq = new int[max + 1];

        for (int n : nums) {
            freq[n]++;
        }

        int[] freqsFreq = new int[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                freqsFreq[freq[i]]++;
            }
        }

        for (int n : nums) {
            if (freqsFreq[freq[n]] == 1) {
                return n;
            }
        }

        return -1;
    }
}
