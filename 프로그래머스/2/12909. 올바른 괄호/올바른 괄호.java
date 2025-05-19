class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int open=0;
        int close=0;
        String [] str = s.split("");
        
        for(int i=0; i<str.length; i++){
            if(str[i].equals("(")){
                open++;
            }else if(str[i].equals(")")){
                close++;
            }
            if(open < close){
                return false;
            }
        }
        if(open == close){
            return true;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}