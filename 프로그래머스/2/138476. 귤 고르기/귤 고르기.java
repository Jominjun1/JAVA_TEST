import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < tangerine.length; i++) {
			if (map.containsKey(tangerine[i]))
				map.put(tangerine[i], map.get(tangerine[i]) + 1);
			else
				map.put(tangerine[i], 1);
        }
        ArrayList<Integer> values = new ArrayList<>(map.values());
		values.sort(Collections.reverseOrder());
        
        int cnt = 0;
		for (int i = 0; i < values.size(); i++) {
			answer++;
			cnt += values.get(i);
			if (cnt >= k)
				break;
		}
        return answer;
    }
}