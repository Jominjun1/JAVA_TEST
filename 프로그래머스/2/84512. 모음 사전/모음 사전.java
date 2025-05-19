class Solution {
    public int solution(String word) {
        int[] weights = {781 , 156 , 31 , 6 , 1};
        String alpha="AEIOU";
        int answer = 0;
        for(int i=0; i<word.length(); i++){
            int num = alpha.indexOf(word.charAt(i));
            answer += weights[i] * num+1;
        }
        return answer;
    }
}