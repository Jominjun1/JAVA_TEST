class Solution {
    public String solution(String bin1, String bin2) {
        int b1 = Integer.valueOf(bin1, 2) + Integer.valueOf(bin2, 2);
        return Integer.toBinaryString(b1);
    }
}