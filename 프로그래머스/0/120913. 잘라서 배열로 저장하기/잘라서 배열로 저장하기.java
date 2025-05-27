class Solution {
    public String[] solution(String my_str, int n) {
        StringBuffer sb = new StringBuffer();
        int cnt=0;
        sb.append(my_str);
        for(int i=1; i*n<my_str.length(); i++){
            sb.insert(i*n+cnt , "@");
            cnt++;
        }
        my_str = sb.toString();
        String[] answer = my_str.split("@");
        return answer;
    }
}