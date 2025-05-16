class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int x=0;
        for(int i=0; i<numbers.length; i++){
            x += numbers[i];
        }
        for (int i=0; i<=9; i++){
            answer += i;
        }
        return answer - x;
    }
}