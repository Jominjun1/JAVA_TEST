import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int j=0;
        int answer =0;
        for(int i=people.length-1; i>j; i--) {
			if(people[i] + people[j] <= limit) {
				answer++;
				j++;
			}
		}
		return people.length-answer;
    }
}