class Solution {
    public int[] solution(int[] arr) {
        if(arr[0] == 10) return new int[] {-1};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        int idx=0;
        int []answer = new int[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min) answer[idx++] = arr[i];
        }
        return answer;
    }
}