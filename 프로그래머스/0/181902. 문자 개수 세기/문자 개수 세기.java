class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) - 65 <= 25){
                answer[my_string.charAt(i) - 65]++;
            }
            else{
                answer[my_string.charAt(i) - 71]++;
            }
        }
        return answer;
    }
}