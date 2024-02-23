class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] ary = cipher.toCharArray();
        for(int i = 1; i <= ary.length / code; i++){
            answer += "" + ary[(code * i) -1];
        }
        return answer;
    }
}