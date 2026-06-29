class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
            sum += arr[i];
        }

        int target = sum / n;
        int left = 0;

        while (left < n && arr[left] <= target) {
            result += target - arr[left];
            left++;
        }

        return result;
    }
}

// Or simply: // Versão alternativa mais simples
// class Solution {
//     public int minOperations(int n) {
//         return (n * n) / 4;
//     }
// }
