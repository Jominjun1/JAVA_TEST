class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] x = s.toCharArray();
        int a=0;
        int b=0;
        for(int i=0; i<x.length; i++){
            if(x[i] == 'p' || x[i] =='P')
                a++;
            
            else if(x[i]=='y' || x[i] =='Y')
                b++;
        }
        System.out.println("Hello Java");

        if(a==b)
            return answer;
        else
            return false;
 
    }
}