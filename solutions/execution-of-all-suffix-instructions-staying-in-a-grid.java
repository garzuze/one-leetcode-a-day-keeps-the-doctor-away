class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        char[] instructions = s.toCharArray();
        int[] result = new int[instructions.length];

        for (int i = 0; i < instructions.length; i++) {
            int count = 0;
            int row = startPos[0];
            int col = startPos[1];

            for (int j = i; j < instructions.length; j++) {
                if (instructions[j] == 'L') {
                    if (col - 1 < 0) {
                        break;
                    }
                    col--;
                } else if (instructions[j] == 'R') {
                    if (col + 1 >= n) {
                        break;
                    }
                    col++;
                } else if (instructions[j] == 'D') {
                    if (row + 1 >= n) {
                        break;
                    }
                    row++;
                } else if (instructions[j] == 'U') {
                    if (row - 1 < 0) {
                        break;
                    }
                    row--;
                }
                count++;
            }

            result[i] = count;
        }

        return result;
    }
}
