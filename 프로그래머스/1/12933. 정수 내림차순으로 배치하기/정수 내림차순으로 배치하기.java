import java.util.*;

class Solution {
    public long solution(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        while (n > 0) {
            long x = n % 10;
            ans.add(x);
            n /= 10;
        }
        ans.sort(Comparator.reverseOrder());
        StringBuilder y = new StringBuilder();
        for (long num : ans) y.append(num);

        return Long.parseLong(y.toString());
    }
}
