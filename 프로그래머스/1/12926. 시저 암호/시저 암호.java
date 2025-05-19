class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i++){
            char c=a[i];
            if(c==' '){
                answer.append(' ');
                continue;
            }
            if(c>='A'&& c<='Z'){
                c=(char)((c-'A'+n)%26+'A');
            }
            else if(c>='a'&&c<='z'){
                c=(char)((c-'a'+n)%26+'a');
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
