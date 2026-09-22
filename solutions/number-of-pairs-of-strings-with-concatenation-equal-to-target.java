class Solution {
    public int numOfPairs(String[] nums, String target) {
        int result = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sb.setLength(0);
                
                sb.append(nums[i]);
                sb.append(nums[j]);
                
                if (sb.toString().equals(target)) {
                    result++;
                }
                
                sb.setLength(0);
                
                sb.append(nums[j]);
                sb.append(nums[i]);
                
                if (sb.toString().equals(target)) {
                    result++;
                }
            }
        }

        return result;
    }
}
