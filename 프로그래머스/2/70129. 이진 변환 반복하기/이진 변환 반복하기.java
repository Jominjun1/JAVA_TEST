class Solution {
    public int[] solution(String s) {
        int cnt=0;
        int zero=0;
        
        while(!s.equals("1")){
            int z =0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    z++;
                }
            }
            s = s.replaceAll("0" , "");
            s = Integer.toBinaryString(s.length());
            cnt++;
            zero+=z;
        }

        int []answer = new int[2];
        answer[0] = cnt;
        answer[1]=zero;
        return answer;
    }
}