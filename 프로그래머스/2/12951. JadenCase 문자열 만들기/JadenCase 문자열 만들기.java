class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split("");
        String ans="";
        for(int i=0; i<arr.length; i++){
            if(1 < i && arr[i-1].equals(" "))
                ans += arr[i].toUpperCase();
            else if(i == 0)
                ans += arr[i].toUpperCase();
            else
                ans += arr[i];
        }
        return ans;
    }
}