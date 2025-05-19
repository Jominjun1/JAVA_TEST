class Solution {
    public String solution(int a, int b) {
		int[] month_days= {31,29,31,30,31,30,31,31,30,31,30,31};
		int days = 0;
		for(int i=0; i<a-1; i++) {
			days += month_days[i];
		}
		
		days += (b-1);
		
		String answer = "";
		switch(days%7) {
		case 0 : return "FRI";
		case 1 : return "SAT";
		case 2 : return "SUN";
		case 3 : return "MON";
		case 4 : return "TUE";
		case 5 : return "WED";
		case 6 : return "THU";
		}
        return "";
    }
}