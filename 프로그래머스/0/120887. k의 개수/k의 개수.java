class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int m = i; m <= j; m++){
            str = m + "";
            for(int n = 0; n < str.length(); n++){
                if(str.charAt(n) == ((char)k + '0')) answer ++;
            }
        }
        return answer;
    }
}