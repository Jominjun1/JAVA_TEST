import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max = Arrays.stream(wallet).max().getAsInt();
        int min = Arrays.stream(wallet).min().getAsInt();
        while(true){
            if(Arrays.stream(bill).max().getAsInt() <= max && 
              Arrays.stream(bill).min().getAsInt() <= min){
                break;
            }
            if(bill[0] < bill[1]){
                bill[1] /=2;
                answer++;
            }
            else{
                bill[0] /=2;
                answer++;
            }
        
        }
        return answer;
    }
}