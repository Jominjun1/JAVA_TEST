class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i=0; i<picture.length; i++){
            String [] s1 = picture[i].split("");
            String s2 = "";
            for(int s=0; s<s1.length; s++){
                for(int j=0; j<k; j++){
                    s2 += s1[s];
                }
            }
            for(int t=0; t<k; t++){
                answer[i*k+t] = s2;
            }
        }
        return answer;
    }
}