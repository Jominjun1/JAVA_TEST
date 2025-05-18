class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length]; 
        for (int i = 0; i < arr1.length; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            binaryString = binaryString.replace('1', '#').replace('0', ' ');
            answer[i] = binaryString;
        }
        return answer;
    }
}
