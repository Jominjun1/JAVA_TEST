class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
	    int min = 0;
	    if(n > m) min = m;
	    else min = n;
	
	    for(int i=min; i>=1; i--) {
		    if(n % i == 0 && m % i == 0) {
			    answer[0] = i;
		    	break;
		    }
	    }	
	    answer[1] = answer[0] * n/answer[0] * m/answer[0];
        return answer;
    }
}