class Solution {
    public int solution(int[] number) {
        int num = number.length;
        int answer =0;
        for(int i = 0;i<num;i++){            
            for(int j = i+1;j<num;j++){
                if(j>=num)
                    break;
                for(int k = j+1;k<num;k++){
                    if(k>=num)
                        break;
                    if(number[i]+number[j]+number[k] == 0)
                        answer++;
                }
            }
        }
        return answer;
    }
}