class Solution {
    public int solution(int num) {
        int answer = 0;
        for(int i=0; i<500; i++){
            if(num % 2 ==0  && 1 < num){
                num /= 2;
                answer++;
            }else if(num % 2 == 1 && 1 < num){
                num = num * 3 + 1;
                answer++;
            }else if(num == 1)
                break;
            else
                return -1;
        }
        return answer;
    }
}