class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String an="";
        int idx =0;
        char[] a = phone_number.toCharArray();
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            answer += a[i];
        }
        for(int i=0; i< phone_number.length()-4; i++){
            an += "*";
        }
        return an+answer;
    }
}