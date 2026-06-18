class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(bin);

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                sb.setCharAt(i,'0');
            } else {
                sb.setCharAt(i,'1');
            }
        }

        return (int) Integer.parseInt(sb.toString(), 2);

    }
}
